
#book;
id long notnull autoIncrease;
name String char(40) notnull;
author String char(20) notnull;
press String char(20) notnull;
price float;
pages int;
desc char;
time_to_library Date;
counts int; //不需要这个字段，不然每条数据都得维护，没有意义；
book_type_id long;

#bookType
id long notnull autoIncrease;
type String char(20) notnull;

#reader
id long notnull autoIncrease;
name String char(20) notnull;
age int;
major String char(20);
grade String char(10);
telephone String char(20);
username String char(20);
password String char(20);

#admin
id long notnull autoIncrease;
username String char(20);
password String char(20);

#borrow
id long notnull autoIncrease;
reader_id long notnull;
admin_id long notnull;
approve_id int notnull;

#approve
id int notnull autoIncrease;
state char(10) notnull;(通过，未通过，未审核)

