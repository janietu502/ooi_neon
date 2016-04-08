package com.rga.neon.test.util

class PolicyBuilder {

    def sql

    PolicyBuilder(db) {
        sql = db
    }

    def createCertifiedPolicy() {

        def newId = getNewPolicyId()
        def newRefNo = getPolicyReferenceNumber()
        def customer_inception_date = '2016-04-10'
        // policies
        sql.execute("INSERT INTO `policies` (`id`,`modified_by`,`modified_date`,`version`,`is_tested`,`total_premium`,`total_premium_without_ipt`,`reference_number`,`type`,`tenant_id`,`agent_id`,`underwriter_id`,`status`,`administration_fee`,`correspond_with`,`show_agent_commission_on_invoice`,`cover_days`,`expiry_date`,`inception_date`,`is_minimum_premium_applied`,`certified_by`,`certified_date`,`minimum_premium_without_ipt`,`last_step`,`agent_commission_rate`,`ipt_rate`,`agent_commission`,`ipt`,`further_detail`,`total_cost`,`created_date`) VALUES (" + newId + ",'QA-TEST','2016-03-10 16:14:41',7,NULL,164.25,91.200,'" + newRefNo + "','OWNER_OCCUPIER',1,6,1,'CERTIFIED',15.000,'AGENT',true,365,'2017-03-09','" + customer_inception_date + "',true,'QA-TEST','2016-03-10',150.000,'PAYMENT',0.250,0.095,22.800,14.250,NULL,179.25,'2016-03-10 16:13:48');")

        // buildings
        sql.execute("INSERT INTO `buildings` (`modified_by`,`modified_date`,`version`,`is_accidental_damage_applied`,`net_amount_after_comfort_loading`,`net_rate_after_comfort_loading`,`no_claim_years`,`premium_with_ipt`,`premium_without_ipt`,`sum_insured`,`type`,`underwriter_excess`,`voluntary_excess`,`tenant_id`,`policy_id`,`agent_commission_amount`,`agent_commission_rate`,`cover_days`,`expiry_date`,`gross_amount`,`gross_amount_after_ad_loading`,`gross_amount_with_loading`,`gross_loading_amount`,`gross_loading_rate`,`gross_rate`,`gross_rate_after_ad_loading`,`inception_date`,`ipt_amount`,`ipt_rate`,`net_amount`,`net_amount_after_ad_loading`,`net_amount_with_loading`,`net_loading_amount`,`net_loading_rate`,`net_rate`,`net_rate_after_ad_loading`,`is_gross_rate_overwritten`) VALUES ('QA-TEST','2016-03-10 16:14:02',2,false,38.500,0.770,0,57.214,52.250,50000.000,'BUILDING',100,NULL,1," + newId + ",13.063,0.250,365,'2017-03-09',55.000,55.000,52.250,-2.750,-0.050,1.100,1.100,'2016-03-10',4.964,0.095,38.500,38.500,36.575,-1.925,-0.050,0.770,0.770,false);")

        // contents
        sql.execute("INSERT INTO `contents` (`modified_by`,`modified_date`,`version`,`is_accidental_damage_applied`,`net_amount_after_comfort_loading`,`net_rate_after_comfort_loading`,`no_claim_years`,`premium_with_ipt`,`premium_without_ipt`,`sum_insured`,`type`,`underwriter_excess`,`voluntary_excess`,`tenant_id`,`policy_id`,`agent_commission_amount`,`agent_commission_rate`,`cover_days`,`expiry_date`,`gross_amount`,`gross_amount_after_ad_loading`,`gross_amount_with_loading`,`gross_loading_amount`,`gross_loading_rate`,`gross_rate`,`gross_rate_after_ad_loading`,`inception_date`,`ipt_amount`,`ipt_rate`,`net_amount`,`net_amount_after_ad_loading`,`net_amount_with_loading`,`net_loading_amount`,`net_loading_rate`,`net_rate`,`net_rate_after_ad_loading`,`is_gross_rate_overwritten`) VALUES ('QA-TEST','2016-03-10 16:14:02',2,false,26.300,2.630,0,42.650,38.950,10000.000,'CONTENT',100,NULL,1," + newId + ",9.738,0.250,365,'2017-03-09',41.000,41.000,38.950,-2.050,-0.050,4.100,4.100,'2016-03-10',3.700,0.095,26.300,26.300,24.985,-1.315,-0.050,2.630,2.630,false);")

        // personal_possessions
        sql.execute("INSERT INTO `personal_possessions` (`modified_by`,`modified_date`,`version`,`is_accidental_damage_applied`,`net_amount_after_comfort_loading`,`net_rate_after_comfort_loading`,`no_claim_years`,`premium_with_ipt`,`premium_without_ipt`,`sum_insured`,`type`,`underwriter_excess`,`voluntary_excess`,`tenant_id`,`policy_id`,`agent_commission_amount`,`agent_commission_rate`,`cover_days`,`expiry_date`,`gross_amount`,`gross_amount_after_ad_loading`,`gross_amount_with_loading`,`gross_loading_amount`,`gross_loading_rate`,`gross_rate`,`gross_rate_after_ad_loading`,`inception_date`,`ipt_amount`,`ipt_rate`,`net_amount`,`net_amount_after_ad_loading`,`net_amount_with_loading`,`net_loading_amount`,`net_loading_rate`,`net_rate`,`net_rate_after_ad_loading`,`is_gross_rate_overwritten`) VALUES ('QA-TEST','2016-02-03 10:32:11',1,false,1.168,9.730,NULL,1.867,1.705,120.000,'PERSONAL_POSSESSION',NULL,NULL,1," + newId + ",0.341,0.200,366,'2017-02-02',1.795,1.795,1.705,-0.090,-0.050,14.960,14.960,'2016-02-03',0.162,0.095,1.168,1.168,1.110,-0.058,-0.050,9.730,9.730,false);")

        // risk_addresses
        sql.execute("INSERT INTO `risk_addresses` (`modified_by`,`modified_date`,`version`,`country`,`county`,`line1`,`line2`,`postcode`,`town`,`tenant_id`,`policy_id`) VALUES ('QA-TEST',NULL,0,'United Kingdom','Greater London','Grove House,551 London Road','','TW7 4DS','Isleworth',1," + newId + ");")

        // property_details
        sql.execute("INSERT INTO `property_details` (`modified_by`,`modified_date`,`version`,`alarm_system`,`bedroom_number`,`building_type`,`building_year`,`flat_roof_percentage`,`floor_construction`,`has_door_lock`,`has_window_lock`,`listed_building`,`tenant_id`,`policy_id`,`mortgage_provider`) VALUES ('QA-TEST',NULL,0,'No alarm system',1,'House (Unspecified)',2016,0,'Wood',true,true,'Not Listed',1," + newId + ",'Abbey National Building Society');")

        // policy_risk_questions
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Have you or any of the interested parties had insurance declined, terminated or renewal refused?',1,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Have you or any of the interested parties been convicted of any criminal offence (non motoring)?',2,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Is the property in an area prone to flooding?',3,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,true,'In a good state of repair and will be so maintained?',4,true,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,true,'Free from any sign and history of damage by subsidence, heave or landslip?',5,true,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'A listed building?',6,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,true,'Built of brick, stone or concrete and roofed with slate, tiles, concrete?',8,true,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Is the property used for business purpose?',9,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Within 7 metres of any shrubs or trees which are more than 3 metres tall?',10,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Suffered any loss, damage or liability in the last 5 years?',11,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,true,'Have you had continuous insurance on the property since you acquired it?',12,true,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Is the property empty or due to become empty? ( empty means wholly or partly unoccupied or not in use)?',13,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,true,'Is the property self-contained with its own separate lockable front door?',14,true,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,true,'Is the property occupied permanently and solely by you, members of your family and any joint named policyholder?',15,true,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Is the property ever left unoccupied for more than 60 days?',16,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',1,false,'Is the property used as a holiday home?',17,false,NULL," + newId + ");")
        sql.execute("INSERT INTO `policy_risk_questions` (`modified_by`,`modified_date`,`version`,`correct_answer`,`question`,`question_id`,`users_answer`,`tenant_id`,`policy_id`) VALUES ('QA-TEST','2016-03-10 16:14:05',2,false,'Is the property undergoing renovations/refurbishments?',7,false,NULL," + newId + ");")

        // policy_referrals
        //sql.execute("")

        // policy_loadings
        sql.execute("INSERT INTO `policy_loadings` (`modified_by`,`modified_date`,`version`,`code`,`gross_loading_rate`,`net_loading_rate`,`target_product_type`,`tenant_id`,`policy_id`) VALUES ('QA-TEST',NULL,0,'L03001',-0.050,-0.050,'BUILDING',1," + newId + ");")
        sql.execute("INSERT INTO `policy_loadings` (`modified_by`,`modified_date`,`version`,`code`,`gross_loading_rate`,`net_loading_rate`,`target_product_type`,`tenant_id`,`policy_id`) VALUES ('QA-TEST',NULL,0,'L03001',-0.050,-0.050,'CONTENT',1," + newId + ");")

        // policy_clauses
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",1,'Alarm Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",2,'Jewellery Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",3,'Non Standard Construction Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",4,'Subsidence, Heave or Landslip Exclusion Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",5,'Flood Exclusion Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",6,'Contractors Exclusion Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",7,'Keys Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",8,'Thatch Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",9,'Mortgage Interest Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",10,'Unattended Vehicles Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",11,'FLEA Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",12,'Stamp Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",13,'Minimum Security Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",14,'Musical Instrument Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",15,'Flat Roof Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",16,'Monthly Payment Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",17,'Legal Fees Clause',false);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",18,'Theft Limitation Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",19,'Tree Pruning Clause',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",20,'Theft or Attempted Theft and Malicious Damage',true);")
        sql.execute("INSERT INTO `policy_clauses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`number`,`description`,`is_applied`) VALUES ('QA-TEST','2016-03-10 16:14:18',1,NULL," + newId + ",21,'Central Heating Clause',false);")

        // policy_excesses
        sql.execute("INSERT INTO `policy_excesses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`name`,`amount`,`is_applied`,`type`) VALUES ('QA-TEST','2016-03-10 16:14:21',1,NULL," + newId + ",'Flood',100,false,'FLOOD');")
        sql.execute("INSERT INTO `policy_excesses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`name`,`amount`,`is_applied`,`type`) VALUES ('QA-TEST','2016-03-10 16:14:21',1,NULL," + newId + ",'Accidental Damage Extension',100,false,'ACCIDENTAL_DAMAGE');")
        sql.execute("INSERT INTO `policy_excesses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`name`,`amount`,`is_applied`,`type`) VALUES ('QA-TEST','2016-03-10 16:14:21',1,NULL," + newId + ",'Escape of Water',250,true,'ESCAPE_OF_WATER');")
        sql.execute("INSERT INTO `policy_excesses` (`modified_by`,`modified_date`,`version`,`tenant_id`,`policy_id`,`name`,`amount`,`is_applied`,`type`) VALUES ('QA-TEST','2016-03-10 16:14:21',1,NULL," + newId + ",'Subsidence',2500,true,'SUBSIDENCE');")

        // payments
        sql.execute("INSERT INTO `payments` (`modified_by`,`modified_date`,`version`,`amount`,`authorisation_code`,`outcome`,`status`,`type`,`tenant_id`,`policy_id`,`transaction_id`,`first_name`,`last_name`,`note`,`title`,`transaction_type`) VALUES ('QA-TEST','2016-03-10 16:14:31',0,-10.00,NULL,1,'DONE','BACS',1," + newId + ",'wZ5b2sFbJoQ3M0uj','QA','Test',NULL,'Mr','NEW_BUSINESS');")
        sql.execute("INSERT INTO `payments` (`modified_by`,`modified_date`,`version`,`amount`,`authorisation_code`,`outcome`,`status`,`type`,`tenant_id`,`policy_id`,`transaction_id`,`first_name`,`last_name`,`note`,`title`,`transaction_type`) VALUES ('QA-TEST','2016-03-10 16:14:35',0,-10.00,NULL,1,'DONE','CHEQUE',1," + newId + ",'s0yMPJXh3hrhNOfi','QA','Test',NULL,'Mr','NEW_BUSINESS');")
        sql.execute("INSERT INTO `payments` (`modified_by`,`modified_date`,`version`,`amount`,`authorisation_code`,`outcome`,`status`,`type`,`tenant_id`,`policy_id`,`transaction_id`,`first_name`,`last_name`,`note`,`title`,`transaction_type`) VALUES ('QA-TEST','2016-03-10 16:14:37',0,199.25,NULL,1,'DONE','ACCOUNT',1," + newId + ",'GeLAkz2cUkZBQLeS','QA','Test',NULL,'Mr','NEW_BUSINESS');")

        // policy_steps
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'QUOTE');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'QUOTE_DETAIL');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'RISK_QUESTION');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'POLICYHOLDER');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'SPECIAL_CLAUSE');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'EXCESS');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",true,'PAYMENT');")
        sql.execute("INSERT INTO `policy_steps` (`policy_id`,`is_done`,`type`) VALUES (" + newId + ",false,'DOCUMENT');")

        // policy_holders
        sql.execute("INSERT INTO `policy_holders` (`modified_by`,`modified_date`,`version`,`is_primary_holder`,`policy_id`,`customer_id`,`is_first_time_bought`) VALUES ('QA-TEST',NULL,0,true," + newId + ",2139,true);")

        return newId
    }

    def cleanTestPolicy(newPolicyId) {

        sql.execute("delete from policy_holders where policy_id = ?", newPolicyId)
        sql.execute("delete from policy_steps where policy_id = ?", newPolicyId)
        sql.execute("delete from payments where policy_id = ?", newPolicyId)
        sql.execute("delete from policy_excesses where policy_id = ?", newPolicyId)
        sql.execute("delete from policy_clauses where policy_id = ?", newPolicyId)
        sql.execute("delete from policy_loadings where policy_id = ?", newPolicyId)
        sql.execute("delete from policy_referrals where policy_id = ?", newPolicyId)
        sql.execute("delete from policy_risk_questions where policy_id = ?", newPolicyId)
        sql.execute("delete from property_details where policy_id = ?", newPolicyId)
        sql.execute("delete from risk_addresses where policy_id = ?", newPolicyId)
        sql.execute("delete from personal_possessions where policy_id = ?", newPolicyId)
        sql.execute("delete from contents where policy_id = ?", newPolicyId)
        sql.execute("delete from buildings where policy_id = ?", newPolicyId)
        sql.execute("delete from policies where id = ?", newPolicyId)
    }


    def getNewPolicyId() {

        def lastPolicy = sql.firstRow("select id from policies order by id desc limit 1")

        return lastPolicy.id + 1
    }

    def getPolicyReferenceNumber() {

        def newNumber

        def current = sql.firstRow("select number from sequence_numbers where type = 'POLICY'")
        newNumber = current.number + 1
        sql.execute("update sequence_numbers set number = ? where type = 'POLICY'", newNumber)

        return 'N1603' + ("000000" + newNumber).substring(newNumber.toString().length())
    }

    /**
     select * from policies where reference_number = 'N1603000978';
     select * from buildings where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from contents where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from personal_possessions where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from risk_addresses where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from property_details where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_risk_questions where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_referrals where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_loadings where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_clauses where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_excesses where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from payments where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_steps where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from policy_holders where policy_id = (select id from policies where reference_number = 'N1603000978');
     select * from customers where id = (select customer_id from policy_holders where policy_id = (select id from policies where reference_number = 'N1603000978'));
     select * from customer_contacts where customer_id = (select customer_id from policy_holders where policy_id = (select id from policies where reference_number = 'N1603000978'));
     */
}
