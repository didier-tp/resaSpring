CREATE DATABASE customers;
\c customers; 
-- \c in postgres like USE in mysql ***

DROP TABLE IF EXISTS Resa;

DROP TABLE IF EXISTS Vol;
DROP TABLE IF EXISTS Localite;

DROP TABLE IF EXISTS Login;
DROP TABLE IF EXISTS Customer;
DROP TABLE IF EXISTS Address;

-- SERIAL or BIGSERIAL postgres TYPE are auto_increment Integer

CREATE TABLE Localite
	(id SERIAL primary key ,
	 ville VARCHAR(12),
     aeroport VARCHAR(32));
     
CREATE TABLE Vol
	(num SERIAL primary key ,
	 prix double precision,
	 refLocDepart integer,
     dateDepart VARCHAR(32),
     refLocArrivee integer,
     dateArrivee VARCHAR(32));     

CREATE TABLE Address
	(id SERIAL primary key ,
     numberAndStreet VARCHAR(64),
     zip VARCHAR(12),
     town VARCHAR(32),
     country VARCHAR(32));

CREATE TABLE Customer
	(id SERIAL primary key ,
     firstName VARCHAR(32),
     lastName VARCHAR(32),
     addressId integer,
     email VARCHAR(32),
     phoneNumber VARCHAR(16));
     
CREATE TABLE Resa
	(idResa SERIAL primary key ,
	 idClient integer,
     dateResa VARCHAR(32),
     comment VARCHAR(32));     
     
CREATE TABLE Login
	(id integer primary key ,
     username VARCHAR(32) unique,
     password VARCHAR(32));
     

ALTER TABLE Customer ADD CONSTRAINT validAddressId
FOREIGN KEY(addressId) REFERENCES Address(id); 

ALTER TABLE Login ADD CONSTRAINT validClientId
FOREIGN KEY(id) REFERENCES Customer(id); 

ALTER TABLE Resa ADD CONSTRAINT validClientId
FOREIGN KEY(idClient) REFERENCES Customer(id); 


INSERT INTO Address(numberAndStreet , zip , town , country) 
   VALUES ('12 rue elle ' , '75000' , 'Paris' , 'France'),
          ('12 rue azerty ' , '69000' , 'Lyon' , 'France');

INSERT INTO Customer(firstName , lastName , addressId ,email , phoneNumber) 
   VALUES ('alex' , 'Therieur' , 1 , 'alex-therieur@iciOulaBas.fr' , '0102030405'),
          ('alain' , 'Therieur' , 2 , 'alain-therieur@xyz.fr' , '0123456789');
   
INSERT INTO Login(id , username , password) 
   VALUES ( 1 , 'alex-therieur' , 'pwd007' ),
          ( 2 , 'alain-therieur' , 'pwd007' );
   
INSERT INTO Resa(idClient , dateResa , comment) 
   VALUES ( 1 , '2017-08-15' , 'resa aaa' ) ,
          ( 1 , '2017-08-17' , 'resa bbb' ) ;
          
   
INSERT INTO Localite(id , ville , aeroport) 
   VALUES ( 1 , 'Paris' , 'Paris-Orly' ),
          ( 2 , 'Paris' , 'Paris-Roissy' ),
          ( 3 , 'Toulouse' , 'Toulouse-Blagnac' ),
          ( 4 , 'Nice' , 'Nice-' );   
          
INSERT INTO Vol(num , prix , refLocDepart , dateDepart,refLocArrivee,dateArrivee) 
   VALUES ( 1 , 100.0 , 1 ,  '2017-09-20' , 3 , '2017-09-20' ),
          ( 2 , 110.0 , 3 ,  '2017-09-21' , 1 , '2017-09-21' ),
          ( 3 , 80.0 , 1 ,  '2017-09-20' , 4 , '2017-09-20' ),
          ( 4 , 70.0 , 4 ,  '2017-09-21' , 1 , '2017-09-21' );            

select * from Localite;
select * from Vol;          

select * from Address;
select * from Customer;
select * from Login;
select * from Resa;
