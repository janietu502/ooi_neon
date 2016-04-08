package com.rga.neon.test.ooi

import geb.spock.GebReportingSpec
import groovy.sql.Sql
import spock.lang.Shared

class DbSpec extends GebReportingSpec {

    @Shared db = Sql.newInstance('jdbc:mysql://sit.raamsys.co.uk:3306/radium', 'dbuser', 'dbuser', 'com.mysql.jdbc.Driver')
}
