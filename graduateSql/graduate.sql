DROP TABLE IF EXISTS graduate_major;
DROP TABLE IF EXISTS graduate_school;


CREATE TABLE graduate_school
(
  Id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  Rank_Overall INT,        
  Name VARCHAR(100) NOT NULL, 
  City VARCHAR(20),
  State VARCHAR(2),
  Room_Board INT,
  In_State_Tuition_Fee INT DEFAULT NULL,
  Tuition_Fee INT,
  Fall_Application_Deadline INT,
  Spring_Application_Deadline INT,
  Application_Fee INT,
  Webpage VARCHAR(100),                     
  Phone VARCHAR(20)
);

CREATE TABLE graduate_major
(
  Id VARCHAR(10) NOT NULL PRIMARY KEY,
  Name VARCHAR(50) NOT NULL
);
ALTER TABLE school.graduate_major CONVERT TO CHARACTER SET utf8
CREATE TABLE graduate_school_major
(
  Major_id VARCHAR(10) NOT NULL,
  School_id INT NOT NULL,
  Degree VARCHAR(10),
  TOEFL INT,
  IELTS INT,
  Gre   INT,
  GMAT INT,
  LSAT INT,
  Phone VARCHAR(20),                                 
  Email VARCHAR(40),
  Rank INT,
  AdmissionWebpage VARCHAR(100),                                     
  Fall_Application_Deadline INT,
  Spring_Application_Deadline INT,        
  Primary Key (School_Id, Major_id),
  FOREIGN KEY (Major_id) REFERENCES graduate_major (Id),
  FOREIGN KEY (School_id) REFERENCES school (Id)
);

commit;

insert graduate_major values ('SCI001', 'Computer Science'); 
insert graduate_major values ('SCI002','Biological Sciences');
insert graduate_major values ('SCI003','Math');
insert graduate_major values ('SCI004','Physics');
insert graduate_major values ('SCI005','Statistics');
insert graduate_major values ('SCI006','Chemistry');
insert graduate_major values ('SS001','Economics');
insert graduate_major values ('SS002','English');
insert graduate_major values ('BUS001','Business');
insert graduate_major values ('Edu001','Education');


insert graduate_school_major values('SCI001',22,'PHDMS',100,7,0,NULL,NULL,'(412) 268-8525','grad-adm@cs.cmu.edu',1,'www.cs.cmu.edu',1210,NULL);
insert graduate_school_major values('SCI002',22,'PHDMS',100,7,0,NULL,NULL,'(412) 268-3180','bio-gradoffice@andrew.cmu.edu',42,'http:/​/​www.cmu.edu/​bio/​graduate/',1115,NULL);
insert graduate_school_major values('SCI006',22,'PHD',98,7,0,NULL,NULL,'(412) 268-1062','hendrich@andrew.cmu.edu',45,'http:/​/​www.chem.cmu.edu/​grad/​index.html',0115,NULL);
insert graduate_school_major values('SCI003',22,'PHDMS',100,NULL,0,NULL,NULL,'(412) 268-2545','sd2e@andrew.cmu.edu',34,'http:/​/​www.math.cmu.edu/​graduate/​index.html',1115,NULL);
insert graduate_school_major values('SCI004',22,'PHD',84,NULL,0,NULL,NULL,'(412) 268-2849','physgrad@andrew.cmu.edu',36,'http:/​/​www.cmu.edu/​physics/​graduate-program/​index.html',1215,NULL);
insert graduate_school_major values('SCI005',22,'PHDMS',100,7,0,NULL,NULL,'(412) 268-8588','mk74@stat.cmu.edu',9,'http:/​/​www.stat.cmu.edu/​',0201,NULL);

insert graduate_school_major values('SCI001',7,'PHDMS',100,7,0,NULL,NULL,'(617) 253-4603','grad-ap@eecs.mit.edu',1,'http://www.eecs.mit.edu/academics-admissions/graduate-program/admissions',1215,NULL);
insert graduate_school_major values('SCI002',7,'PHD',100,6,0,NULL,NULL,'(617) 253-4701','gradbio@mit.edu',1,'http://www.eecs.mit.edu/academics-admissions/graduate-program/admissions',1201,NULL);
insert graduate_school_major values('SCI003',7,'PHD',100,7,0,NULL,NULL,'(617) 253-2689','ggradofc@math.mit.edu',1,'http://math.mit.edu/academics/grad/admission/index.php',1215,NULL);
insert graduate_school_major values('SCI004',7,'PHD',100,7,0,NULL,NULL,'(617) 253-4841','physics-grad@mit.edu',1,'http://web.mit.edu/physics/prospective/graduate/index.html',1215,NULL);
insert graduate_school_major values('SCI006',7,'PHD',100,7,0,NULL,NULL,'(617) 253-1845','chemgradeducation@mit.edu',1,'http://www.eecs.mit.edu/academics-admissions/graduate-program/admissions',1215,NULL);

insert graduate_school_major values('SCI001',4,'PHDMS',100,NULL,0,NULL,NULL,'(650) 723-2273','admissions@cs.stanford.edu',1,'http://www.cs.stanford.edu/admissions/general-information',1208,NULL);
insert graduate_school_major values('SCI002',4,'PHDMS',100,NULL,0,NULL,NULL,'(650) 723-2413','mpinheiro@stanford.edu',1,'http:/​/​www.stanford.edu/​dept/​biology/​index.html',0119,NULL);
insert graduate_school_major values('SCI003',4,'PHD',100,NULL,0,NULL,NULL,'(650) 725-6284','green@math.stanford.edu',5,'http://mathematics.stanford.edu/academics/graduate/graduate-admissions/#whattoeflscoresdoineed',1210,NULL);
insert graduate_school_major values('SCI004',4,'PHDMS',100,NULL,0,NULL,NULL,'(650) 723-4344','phys-admissions@lists.stanford.edu',2,'https://gradadmissions.stanford.edu/programs/physics',1215,NULL);
insert graduate_school_major values('SCI005',4,'PHDMS',100,NULL,0,NULL,NULL,'(650) 723-2300','stat-admissions-ms@lists.stanford.edu',1,'https://statistics.stanford.edu/academics/admissions',0110,NULL);
insert graduate_school_major values('SCI006',4,'PHDMS',100,NULL,0,NULL,NULL,'(650) 723-1525','chem.admissions@stanford.edu',4,'https://statistics.stanford.edu/academics/admissions',1206,NULL);

insert graduate_school_major values('SCI001',21,'PHDMS',90,7,0,NULL,NULL,'(510) 642-3068','gradadmissions@eecs.berkeley.edu',1,'http:/​/​www.eecs.berkeley.edu/​',0202,0901);
insert graduate_school_major values('SCI002',21,'PHDMS',90,7,0,NULL,NULL,'(510) 642-5113','knowlton@uclink.berkeley.edu',4,'http:/​/​ls.berkeley.edu/​bio/​',0202,0901);
insert graduate_school_major values('SCI003',21,'PHDMS',90,7,0,NULL,NULL,'(510) 642-6550','tataru@math.berkeley.edu',3,'https://math.berkeley.edu/programs/graduate/admissions',1209,NULL);
insert graduate_school_major values('SCI004',21,'PHDMS',90,7,0,NULL,NULL,'(510) 642-7166','fhellman@physics.berkeley.edu',2,'http:/​/​www.physics.berkeley.edu/​index.php?option=com_content&task=view&id=88&Itemid=140',1215,NULL);
insert graduate_school_major values('SCI005',21,'PHDMS',90,7,0,NULL,NULL,'(510) 642-5361','sao@stat.berkeley.edu',1,'http:/​/​www.stat.berkeley.edu/​',1201,NULL);
insert graduate_school_major values('SCI006',21,'PHDMS',90,7,0,NULL,NULL,'(510) 642-5882','iyoung@berkeley.edu',1,'http://chemistry.berkeley.edu/grad/chem/apply',1201,NULL);

insert graduate_school_major values('SCI001',40,'PHDMS',90,7,0,NULL,NULL,'(217) 333-3527','mkelley@illinois.edu',5,'http:/​/​www.cs.uiuc.edu/​graduate/​',0115,1015);
insert graduate_school_major values('SCI002',40,'PHDMS',90,7,0,NULL,NULL,'(217) 333-3044','sib@life.illinois.edu',11,'http:/​/​sib.illinois.edu/​graduate.htm',0115,1015);
insert graduate_school_major values('SCI003',40,'PHDMS',90,7,0,NULL,NULL,'(217) 333-5749','gradoffice@math.uiuc.edu',13,'http:/​/​www.math.uiuc.edu/​GraduateProgram/​',0115,1015);
insert graduate_school_major values('SCI004',40,'PHDMS',90,7,0,NULL,NULL,'(217) 333-3645','denisejd@illinois.edu',7,'http:/​/​www.physics.uiuc.edu/​education/​graduate/​',0115,1015);
insert graduate_school_major values('SCI005',40,'PHDMS',90,7,0,NULL,NULL,'(217) 333-3527','mkelley@illinois.edu',24,'http:/​/​www.eecs.berkeley.edu/​',0115,1015);
insert graduate_school_major values('SCI006',40,'PHDMS',90,7,0,NULL,NULL,'(800) 516-0276','chemadm@scs.uiuc.edu',10,'http:/​/​www.chemistry.illinois.edu/​graduates/​index.html',0115,1015);

insert graduate_school_major values('SCI001',1093,'PHDMS',80,7,0,NULL,NULL,'(607) 255-7316','www@cs.cornell.edu',6,'http:/​/​www.cs.cornell.edu/​degreeprogs/​grad/​index.htm',0201,1001);
insert graduate_school_major values('SCI002',1093,'PHDMS',80,7,0,NULL,NULL,'(607) 255-2203','vmv1@cornell.edu',11,'http:/​/​bmcb.cornell.edu/​',1201,NULL);
insert graduate_school_major values('SCI003',1093,'PHD',80,7,0,NULL,NULL,'(607) 255-3624','dgs@math.cornell.edu',13,'http:/​/​www.math.cornell.edu/​Graduate/​graduate.html',0201,1001);
insert graduate_school_major values('SCI004',1093,'PHD',80,7,0,NULL,NULL,'(607) 255-6016','physicsgrad@cornell.edu',7,'http:/​/​www.physics.cornell.edu/​graduate/​',1215,NULL);
insert graduate_school_major values('SCI005',1093,'PHDMS',80,7,0,NULL,NULL,'(607) 255-8066','dld8@cornell.edu',24,'http:/​/​www.stat.cornell.edu/​',0201,1001);
insert graduate_school_major values('SCI006',1093,'PHD',80,7,0,NULL,NULL,'(607) 255-4139','chemgrad@cornell.edu',10,'http:/​/​www.chem.cornell.edu/​grad/​index.asp',0201,1001);

insert graduate_school_major values('SCI001',42,'PHD',92,NULL,0,NULL,NULL,'(206) 543-1695','lindsaym@cs.washington.edu',6,'http:/​/​www.cs.washington.edu/​education/​grad/​prospective.html',1215,NULL);
insert graduate_school_major values('SCI002',42,'PHD',61,NULL,0,NULL,NULL,'(206) 543-1620','farrowj@u.washington.edu',19,'http:/​/​www.biology.washington.edu/​',1201,NULL);
insert graduate_school_major values('SCI003',42,'PHDMS',92,NULL,0,NULL,NULL,'(206) 543-6830','grads@math.washington.edu',25,'http:/​/​www.math.washington.edu/​Grads/​',1215,NULL);
insert graduate_school_major values('SCI004',42,'PHD',92,7,0,NULL,NULL,'(206) 543-2770','grad@phys.washington.edu',22,'http:/​/​www.phys.washington.edu/​grad.htm',1215,NULL);
insert graduate_school_major values('SCI005',42,'PHDMS',92,7,0,NULL,NULL,'(206) 543-7237','statgradadv@stat.washington.edu',7,'http:/​/​www.stat.washington.edu/​graduate/​',1215,NULL);
insert graduate_school_major values('SCI006',42,'PHD',92,7,0,NULL,NULL,'(206) 543-1610','info@chem.washington.edu',24,'http:/​/​depts.washington.edu/​chem/​',1204,NULL);

insert graduate_school_major values('SCI001',1,'PHD',108,8,0,NULL,NULL,'(609) 258-5387','gradinfo@cs.princeton.edu',8,'http://www.cs.princeton.edu/grad/admissions-requirements','12-15');
insert graduate_school_major values('SCI002',1,'PHD',108,8,0,NULL,NULL,'(206) 543-1610','montondo@princeton.edu',9,'http:/​/​www.molbio.princeton.edu/​','12-01');
insert graduate_school_major values('SCI003',1,'PHD',108,8,0,NULL,NULL,'(609) 258-4200','www@math.princeton.edu',1,'http:/​/​www.math.princeton.edu/​graduate/​','12-15');
insert graduate_school_major values('SCI004',1,'PHD',108,8,0,NULL,NULL,'(609) 258-4403','lerner@princeton.edu',2,'http:/​/​www.princeton.edu/​physics/​academics/​graduate-program/​','12-15');
insert graduate_school_major values('SCI006',1,'PHD',108,8,0,NULL,NULL,'(609) 258-3030','cheminfo@lists.princeton.edu',8,'http:/​/​www.princeton.edu/​~chemdept/​graduate/​index.html','12-15');





