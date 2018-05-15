CREATE TABLE address
(
  id_address INT PRIMARY KEY AUTO_INCREMENT,
  street     VARCHAR(55),
  city       VARCHAR(55) NOT NULL,
  house_nr   VARCHAR(5)  NOT NULL,
  flat_nr    SMALLINT
);

CREATE TABLE category
(
  id_category   INT PRIMARY KEY AUTO_INCREMENT,
  name_category VARCHAR(55) NOT NULL
);

CREATE TABLE client
(
  id_client    INT PRIMARY KEY AUTO_INCREMENT,
  name_client  VARCHAR(55)   NOT NULL,
  phone_client NUMERIC(9, 0) NOT NULL,
  id_address   INT           NOT NULL
);

CREATE TABLE dish
(
  id_dish     INT PRIMARY KEY AUTO_INCREMENT,
  id_category INT          NOT NULL,
  name_dish   VARCHAR(55)  NOT NULL,
  image_path  VARCHAR(255) NOT NULL,
  description VARCHAR(255) NOT NULL,
  price_dish  FLOAT        NOT NULL
);

CREATE TABLE drink
(
  id_drink    INT PRIMARY KEY AUTO_INCREMENT,
  name_drink  VARCHAR(55) NOT NULL,
  price_drink FLOAT       NOT NULL
);

CREATE TABLE ingredient
(
  id_ingredient   INT PRIMARY KEY AUTO_INCREMENT,
  name_ingredient VARCHAR(55) NOT NULL
);

CREATE TABLE dish_ingredient
(
  id_dish       INT NOT NULL,
  id_ingredient INT NOT NULL,
  PRIMARY KEY (id_dish, id_ingredient)
);

CREATE TABLE pay_method
(
  id_pay_method   INT PRIMARY KEY AUTO_INCREMENT,
  name_pay_method VARCHAR(55) NOT NULL
);

CREATE TABLE purchase
(
  id_purchase   INT PRIMARY KEY AUTO_INCREMENT,
  nr_purchase   INT NOT NULL,
  time_purchase TIME,
  notes         VARCHAR(255),
  id_address    INT NOT NULL,
  id_pay_method INT NOT NULL
);

CREATE TABLE purchase_dish
(
  id_purchase INT NOT NULL,
  id_dish     INT NOT NULL,
  count_dish  INT NOT NULL,
  PRIMARY KEY (id_purchase, id_dish)
);

CREATE TABLE purchase_drink
(
  id_drink    INT NOT NULL,
  id_purchase INT NOT NULL,
  count_drink INT NOT NULL,
  PRIMARY KEY (id_drink, id_purchase)
);

ALTER TABLE client
  ADD CONSTRAINT FK_CLIENT_RELATIONS_ADDRESS FOREIGN KEY (id_address)
REFERENCES address (id_address);

ALTER TABLE dish
  ADD CONSTRAINT FK_DISH_RELATIONS_CATEGORY FOREIGN KEY (id_category)
REFERENCES category (id_category);

ALTER TABLE dish_ingredient
  ADD CONSTRAINT FK_DISH_ING_RELATIONS_DISH FOREIGN KEY (id_dish)
REFERENCES dish (id_dish);

ALTER TABLE dish_ingredient
  ADD CONSTRAINT FK_DISH_ING_RELATIONS_INGREDIE FOREIGN KEY (id_ingredient)
REFERENCES ingredient (id_ingredient);

ALTER TABLE purchase
  ADD CONSTRAINT FK_purchase_RELATIONS_PAY_METH FOREIGN KEY (id_pay_method)
REFERENCES pay_method (id_pay_method);

ALTER TABLE purchase
  ADD CONSTRAINT FK_purchase_RELATIONS_ADDRESS FOREIGN KEY (id_address)
REFERENCES address (id_address);

ALTER TABLE purchase_dish
  ADD CONSTRAINT FK_purchase_DI_RELATIONS_purchase FOREIGN KEY (id_purchase)
REFERENCES purchase (id_purchase);

ALTER TABLE purchase_dish
  ADD CONSTRAINT FK_purchase_DI_RELATIONS_DISH FOREIGN KEY (id_dish)
REFERENCES dish (id_dish);

ALTER TABLE purchase_drink
  ADD CONSTRAINT FK_purchase_DR_RELATIONS_DRINK FOREIGN KEY (id_drink)
REFERENCES drink (id_drink);

ALTER TABLE purchase_drink
  ADD CONSTRAINT FK_purchase_DR_RELATIONS_purchase FOREIGN KEY (id_purchase)
REFERENCES purchase (id_purchase);