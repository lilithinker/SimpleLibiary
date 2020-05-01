
#book;
id long notnull autoIncrease;
name String char(40) notnull;
author String char(20) notnull;
press String char(20) notnull;
price float;
pages int;
timeToLibiary Date;
counts int;
bookTypeId long;

#bookType
id long notnull autoIncrease;
type String char(20) notnull;

#reader
id long notnull autoIncrease;
name String char(20) notnull;
age int;
major String char(20);
grade String char(10);
tele String char(20);
username String char(20);
password String char(20);

#admin
id long notnull autoIncrease;
username String char(20);
password String char(20);

#borrow
id long notnull autoIncrease;
readerId long notnull;
adminId long notnull;
approveId int notnull;

#approve
id int notnull autoIncrease;
state String char(10) notnull;(通过，未通过，未审核)

