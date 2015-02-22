CREATE TABLE `qstn_def` (
  `QSTN_ID` int(2) NOT NULL AUTO_INCREMENT,
  `QSTN_NAME` varchar(50) NOT NULL,
  `QSTN_DESC` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`QSTN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `user_det` (
  `USER_ID` int(5) NOT NULL AUTO_INCREMENT,
  `F_NAME` varchar(30) NOT NULL,
  `L_NAME` varchar(30) NOT NULL,
  `DATE_OF_JOIN` date NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `QSTN_ID` int(5) NOT NULL,
  `ANS_T` varchar(50) NOT NULL,
  `ROLE_ID` int(2) NOT NULL,
  PRIMARY KEY (`USER_ID`),
  KEY `FK_user_det_qstn` (`QSTN_ID`),
  KEY `FK_user_det` (`ROLE_ID`),
  CONSTRAINT `FK_user_det` FOREIGN KEY (`ROLE_ID`) REFERENCES `user_role_def` (`ROLE_ID`),
  CONSTRAINT `FK_user_det_qstn` FOREIGN KEY (`QSTN_ID`) REFERENCES `qstn_def` (`QSTN_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

CREATE TABLE `user_role_def` (
  `ROLE_ID` int(2) NOT NULL AUTO_INCREMENT,
  `ROLE_NAME` varchar(50) NOT NULL,
  `ROLE_DESC` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

