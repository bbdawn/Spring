drop table springboot_department;
create table springboot_department(
	department_no number primary key,
	department_name varchar2(100) not null,
	location varchar2(100) not null
)

drop table springboot_employee;
create table springboot_employee(
	employee_no number primary key,
	name varchar2(100) not null,
	salary number not null,
	department_no number not null,
	constraint fk_springboot_department_no foreign key(department_no) references springboot_department(department_no)
)


insert into springboot_department values(10,'전략기획','판교');
insert into springboot_department values(20,'해양수산','부산');
insert into springboot_department values(30,'공공사업','판교');

commit
-- 부서 테이블에는 40번 부서가 없으므로 error , 참조 무결성 제약조건 위배 
-- insert into springboot_employee values(4,'아이유',300,40);
insert into springboot_employee values(1,'아이유',300,10);
insert into springboot_employee values(2,'조승우',500,10);
insert into springboot_employee values(3,'배두나',400,20);
insert into springboot_employee values(4,'유재석',700,10);

commit

select * from springboot_department;
select * from springboot_employee;

select e.employee_no,e.name,e.salary,d.department_name,d.department_name
from springboot_employee e
inner join springboot_department d on e.department_no=d.department_no
where  e.employee_no=1












