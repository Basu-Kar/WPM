CREATE TABLE `qstn_def` (
  `QSTN_ID` int(2) NOT NULL AUTO_INCREMENT,
  `QSTN_NAME` varchar(50) NOT NULL,
  `QSTN_DESC` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`QSTN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1

CREATE TABLE `review_cmnt` (
  `WPM_ID` int(5) NOT NULL,
  `REVIEW_ID` int(5) NOT NULL, 
  `CMNT_ID` int(5) NOT NULL AUTO_INCREMENT,
  `ASSIGNED_TO` int(5) NOT NULL,
  `REVIEW_STAT_ID` int(5) DEFAULT NULL,
  `CMNT_T` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`CMNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `user_det` (
  `USER_ID` int(5) NOT NULL AUTO_INCREMENT,
  `F_NAME` varchar(30) NOT NULL,
  `L_NAME` varchar(30) NOT NULL,
  `DATE_OF_JOIN` date NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `QSTN_ID` int(5) DEFAULT NULL,
  `ANS_T` varchar(50) DEFAULT NULL,
  `ROLE_ID` int(2) NOT NULL,
  `email` varchar(30) NOT NULL,
  PRIMARY KEY (`USER_ID`,`email`),
  KEY `FK_user_det_qstn` (`QSTN_ID`),
  KEY `FK_user_det` (`ROLE_ID`),
  CONSTRAINT `FK_user_det` FOREIGN KEY (`ROLE_ID`) REFERENCES `user_role_def` (`ROLE_ID`),
  CONSTRAINT `FK_user_det_qstn` FOREIGN KEY (`QSTN_ID`) REFERENCES `qstn_def` (`QSTN_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1

CREATE TABLE `user_role_def` (
  `ROLE_ID` int(2) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(50) NOT NULL,
  `ROLE_DESC` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1

CREATE TABLE `wpm_det` (
  `PROJ_ID` int(5) NOT NULL,
  `WPM_ID` int(5) NOT NULL AUTO_INCREMENT,
  `WPM_NAME` varchar(100) NOT NULL,
  `WPM_DESC` varchar(100) DEFAULT NULL,
  UNIQUE KEY `WPM_ID` (`WPM_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `wpm_phase` (
  `WPM_PHASE_ID` int(5) NOT NULL AUTO_INCREMENT,
  `WPM_PHASE_NAME` varchar(50) DEFAULT NULL,
  `WPM_PHASE_DESC` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`WPM_PHASE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `wpm_proj` (
  `PROJ_ID` int(11) NOT NULL AUTO_INCREMENT,
  `PROJ_NAME` varchar(100) NOT NULL,
  `PROJ_DESC` varchar(100) DEFAULT NULL,
  `PROJ_START_DATE` timestamp NULL DEFAULT NULL,
  `PROJ_END_DATE` timestamp NULL DEFAULT NULL,
  `PROJ_STATUS` int(5) DEFAULT NULL,
  `PROJ_ASSIGNED_TO` int(5) DEFAULT NULL,
  PRIMARY KEY (`PROJ_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1

CREATE TABLE `wpm_qstn` (
  `qstn_id` int(11) NOT NULL AUTO_INCREMENT,
  `qstn_name` varchar(255) DEFAULT NULL,
  `qstn_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`qstn_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `wpm_review` (
  `WPM_ID` int(5) NOT NULL,
  `REVIEW_ID` int(5) NOT NULL AUTO_INCREMENT,
  `REVIEW_TYPE` int(5) DEFAULT NULL,
  `REVIEW_TTLE` varchar(100) NOT NULL,
  `REVIEWER_NAME` varchar(50) DEFAULT NULL,
  `REVIEWER_ID` int(5) NOT NULL,
  PRIMARY KEY (`REVIEW_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `wpm_stat` (
  `WPM_ID` int(5) DEFAULT NULL,
  `WPM_STAT_ID` int(5) DEFAULT NULL,
  `WPM_PHASE_ID` int(5) NOT NULL AUTO_INCREMENT,
  `WPM_ASSIGNED_TO` int(5) DEFAULT NULL,
  PRIMARY KEY (`WPM_PHASE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1