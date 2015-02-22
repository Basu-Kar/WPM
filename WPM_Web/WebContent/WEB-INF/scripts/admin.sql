insert into wpm.qstn_def 
	(QSTN_NAME,	QSTN_DESC)	values	('Your school name?',''	);

insert into wpm.user_role_def (ROLE_NAME,ROLE_DESC)	values	('admin','admin');
insert into wpm.user_det 
	(F_NAME,L_NAME,DATE_OF_JOIN,PASSWORD,QSTN_ID,ANS_T,ROLE_ID	)
	values	('admin','',current_date,'admin',1,'na',1);

commit;