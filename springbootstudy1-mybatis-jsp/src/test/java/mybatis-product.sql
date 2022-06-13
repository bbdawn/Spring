DROP TABLE spring_product;
DROP SEQUENCE spring_product_seq;
CREATE TABLE spring_product(
	product_no NUMBER PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER NOT NULL
)
CREATE SEQUENCE spring_product_seq;

INSERT INTO spring_product VALUES(spring_product_seq.nextval,'아이폰9','애플',150);
INSERT INTO spring_product VALUES(spring_product_seq.nextval,'갤럭시8','삼성',100);
INSERT INTO spring_product VALUES(spring_product_seq.nextval,'아이폰7','애플',50);
INSERT INTO spring_product VALUES(spring_product_seq.nextval,'아이폰2','애플',10);
INSERT INTO spring_product VALUES(spring_product_seq.nextval,'갤럭시9','삼성',120);

COMMIT

SELECT COUNT(*) FROM SPRING_PRODUCT;








