
package com.rga.neon.test.util

import org.apache.poi.xssf.usermodel.XSSFCell
import org.apache.poi.xssf.usermodel.XSSFRow
import org.apache.poi.xssf.usermodel.XSSFWorkbook


class ExcelBuilder {

    def workbook
    def labels
    def row

    ExcelBuilder(String fileName) {

        XSSFRow.metaClass.getAt = {int idx ->

            def cell = delegate.getCell(idx)
            if(! cell) {
                return null
            }

            def value
            switch(cell.cellType) {

                case XSSFCell.CELL_TYPE_NUMERIC:
                    value = XSSFDateUtil.isCellDateFormatted(cell) ? cell.dateCellValue : cell.numericCellValue
                    break

                case XSSFCell.CELL_TYPE_BOOLEAN:
                    value = cell.booleanCellValue
                    break

                default:
                    value = cell.stringCellValue
                    break
            }

            return value
        }

        new File(fileName).withInputStream{is->
            workbook = new XSSFWorkbook(is)
        }
    }

    def getSheet(idx) {

        if(! idx) {
            idx = 0
        }

        def sheet
        if(idx instanceof Number) {
            sheet = workbook.getSheetAt(idx)
        } else if(idx ==~ /^\d+$/) {
            sheet = workbook.getSheetAt(Integer.valueOf(idx))
        } else {
            sheet = workbook.getSheet(idx)
        }

        return sheet
    }

    def int getRowCount(sheet){

        int number=sheet.getLastRowNum()+1
        return number
    }
}
