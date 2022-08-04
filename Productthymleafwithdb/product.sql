use ecommerce;
create table Product(id bigint primary key,
sku VARCHAR(255),
name VARCHAR(255),
description VARCHAR(255),
unitprice DECIMAL(13,2),
imageurl VARCHAR(255),
unitsinstock int,
datecreated DATETIME(6),
lastupdated DATETIME(6),
categoryid bigint,
foreign key(categoryid) references Productcategory(categoryid)
);

create table Productcategory(categoryid bigint primary key,
categoryname VARCHAR(255)
);
select * from product;

