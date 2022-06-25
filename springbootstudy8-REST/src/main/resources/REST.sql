create table rest_product(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null
)
create sequence rest_product_seq;
select * from rest_product;
insert into rest_product values(rest_product_seq.nextval,'갤럭시8','삼성',150);
insert into rest_product values(rest_product_seq.nextval,'아이폰7','애플',170);
commit


