CREATE TABLE WritingGroups
(
groupname varchar(20) NOT NULL,
headwriter varchar(20) NOT NULL,
yearformed varchar(20) NOT NULL,
subject varchar(20) NOT NULL
);

alter table WritingGroups add constraint pk_groupname primary key (groupname);


CREATE TABLE Books
(
publishername varchar(20) NOT NULL,
yearpublished varchar(20) NOT NULL,
numberpages varchar(20) NOT NULL,
booktitle varchar(30) NOT NULL,
groupname varchar(20) NOT NULL
);

alter table Books add constraint pk_pubname primary key (booktitle,groupname);
alter table Books add constraint fk_publisher foreign key (publishername) references Publishers (publishername);

CREATE TABLE Publishers
(
publishername varchar(20) NOT NULL,
publisheraddress varchar(30) NOT NULL,
publisherphone varchar(20) NOT NULL,
publisheremail varchar(30) NOT NULL
);

alter table Publishers add constraint pk_publishername primary key (publishername);

-- drop table WritingGroups;
-- drop table Books;
-- drop table Publishers;
