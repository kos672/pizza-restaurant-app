INSERT INTO pay_method VALUES (NULL, 'gotówką przy odbiorze');
INSERT INTO pay_method VALUES (NULL, 'kartą przy odbiorze');
INSERT INTO pay_method VALUES (NULL, 'płatność online');

INSERT INTO address VALUES (NULL, 'Olszewskiego', 'Wrocław', 110, 25);
INSERT INTO address VALUES (NULL, 'Kwiska', 'Wrocław', 80, 3);
INSERT INTO address VALUES (NULL, '3 maja', 'Warszawa', 33, 11);
INSERT INTO address VALUES (NULL, 'Piłsudskiego', 'Kraków', 68, 10);
INSERT INTO address VALUES (NULL, 'Fabryczna', 'Łódź', 3, 0);

INSERT INTO drink VALUES (NULL, 'Coca-cola', 5.99);
INSERT INTO drink VALUES (NULL, 'Nestea', 4.99);
INSERT INTO drink VALUES (NULL, '7UP', 4.99);
INSERT INTO drink VALUES (NULL, 'Sok jabłkowy', 5.49);
INSERT INTO drink VALUES (NULL, 'Mirinda', 5.99);

INSERT INTO category VALUES (NULL, 'pizza');
INSERT INTO category VALUES (NULL, 'calzone');
INSERT INTO category VALUES (NULL, 'pasta');
INSERT INTO category VALUES (NULL, 'lasagne');
INSERT INTO category VALUES (NULL, 'insalate');

INSERT INTO ingredient VALUES (NULL, 'sos pomidorowy');
INSERT INTO ingredient VALUES (NULL, 'sos czosnkowy');
INSERT INTO ingredient VALUES (NULL, 'sos śmietankowy');
INSERT INTO ingredient VALUES (NULL, 'jajko');
INSERT INTO ingredient VALUES (NULL, 'pieczarki');
INSERT INTO ingredient VALUES (NULL, 'makaron Tagliatelle');
INSERT INTO ingredient VALUES (NULL, 'ser corregio');
INSERT INTO ingredient VALUES (NULL, 'papryka');
INSERT INTO ingredient VALUES (NULL, 'cebula');
INSERT INTO ingredient VALUES (NULL, 'kukurydza');
INSERT INTO ingredient VALUES (NULL, 'szynka');
INSERT INTO ingredient VALUES (NULL, 'wołowina');
INSERT INTO ingredient VALUES (NULL, 'salami');
INSERT INTO ingredient VALUES (NULL, 'pepperoni');
INSERT INTO ingredient VALUES (NULL, 'boczek');
INSERT INTO ingredient VALUES (NULL, 'ser feta');
INSERT INTO ingredient VALUES (NULL, 'szpinak');
INSERT INTO ingredient VALUES (NULL, 'oliwki');
INSERT INTO ingredient VALUES (NULL, 'ananas');
INSERT INTO ingredient VALUES (NULL, 'kurczak');
INSERT INTO ingredient VALUES (NULL, 'rukola');

INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'pizza margherita', 'someImagePath', 'Klasyczna
                                pizza', 12.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'pizza hawajska', 'someImagePath', 'Pizza hawajska
                                z ananasem i kurczakiem', 15.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'pizza pepperoni', 'someImagePath', 'Pizza
                                pepperoni dla tych, kto uwielba salami', 16.99);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'calzone'), 'con pollo', 'someImagePath', 'Niestandardowe
                                danie', 17.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'calzone'), 'interno ricco', 'someImagePath', 'Niestandardowe
                                danie znow', 17.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pasta'), 'bolognese', 'someImagePath', 'Sos bolognese', 18.99);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pasta'), 'alla carbonara', 'someImagePath', 'Standardowa
                                pasta', 18.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pasta'), 'spinaci', 'someImagePath', 'Pasta szpinakowa', 15.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'lasagne'), 'lasagna bolognese', 'someImagePath', 'Niezwykle
                                danie godne polecenia', 19.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'insalate'), 'pollo ricolla', 'someImagePath', 'Salatka z
                                rukola', 13.49);

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza margherita'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'sos pomidorowy'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza hawajska'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza hawajska'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'szynka'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza hawajska'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'ananas'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza pepperoni'), (SELECT id_ingredient
                                                                            FROM ingredient
                                                                            WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza pepperoni'), (SELECT id_ingredient
                                                                            FROM ingredient
                                                                            WHERE name_ingredient = 'pepperoni'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'con pollo'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'sos czosnkowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'con pollo'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'kurczak'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'con pollo'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'cebula'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'con pollo'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'kukurydza'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'wołowina'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'pepperoni'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'oliwki'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'pieczarki'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'papryka'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'interno ricco'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'cebula'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'bolognese'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'makaron Tagliatelle'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'bolognese'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'bolognese'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'ser corregio'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'alla carbonara'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE
                                                                             name_ingredient = 'makaron Tagliatelle'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'alla carbonara'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'boczek'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'alla carbonara'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'ser corregio'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'alla carbonara'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'sos śmietankowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'alla carbonara'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'jajko'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'spinaci'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'makaron Tagliatelle'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'spinaci'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'szpinak'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'spinaci'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'kurczak'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'spinaci'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'sos czosnkowy'));
