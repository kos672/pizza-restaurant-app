INSERT INTO pay_method VALUES (NULL, 'gotówką przy odbiorze');
INSERT INTO pay_method VALUES (NULL, 'kartą przy odbiorze');
INSERT INTO pay_method VALUES (NULL, 'płatność online');

INSERT INTO address VALUES (NULL, 'Olszewskiego', 'Wrocław', 110, 25);
INSERT INTO address VALUES (NULL, 'Kwiska', 'Wrocław', 80, 3);
INSERT INTO address VALUES (NULL, '3 maja', 'Warszawa', 33, 11);
INSERT INTO address VALUES (NULL, 'Piłsudskiego', 'Kraków', 68, 10);
INSERT INTO address VALUES (NULL, 'Fabryczna', 'Łódź', 3, 0);

INSERT INTO drink VALUES (NULL, 'Coca-cola', 5.99);
INSERT INTO drink VALUES (NULL, '7UP', 4.99);
INSERT INTO drink VALUES (NULL, 'Mirinda', 5.99);
INSERT INTO drink VALUES (NULL, 'Nestea', 4.99);
INSERT INTO drink VALUES (NULL, 'Sok jabłkowy', 5.49);
INSERT INTO drink VALUES (NULL, 'Woda niegazowana', 5.49);
INSERT INTO drink VALUES (NULL, 'Woda gazowana', 5.49);

INSERT INTO category VALUES (NULL, 'pizza');
INSERT INTO category VALUES (NULL, 'spaghetti');
INSERT INTO category VALUES (NULL, 'lasagne');
INSERT INTO category VALUES (NULL, 'risotto');
INSERT INTO category VALUES (NULL, 'ravioli');
INSERT INTO category VALUES (NULL, 'piadina');

INSERT INTO ingredient VALUES (NULL, 'sos pomidorowy');
INSERT INTO ingredient VALUES (NULL, 'sos czosnkowy');
INSERT INTO ingredient VALUES (NULL, 'sos śmietankowy');
INSERT INTO ingredient VALUES (NULL, 'jajka');
INSERT INTO ingredient VALUES (NULL, 'łosóś');
INSERT INTO ingredient VALUES (NULL, 'pieczarki');
INSERT INTO ingredient VALUES (NULL, 'makaron Tagliatelle');
INSERT INTO ingredient VALUES (NULL, 'ser corregio');
INSERT INTO ingredient VALUES (NULL, 'papryka');
INSERT INTO ingredient VALUES (NULL, 'śmietana');
INSERT INTO ingredient VALUES (NULL, 'cebula');
INSERT INTO ingredient VALUES (NULL, 'oregano');
INSERT INTO ingredient VALUES (NULL, 'bazylia');
INSERT INTO ingredient VALUES (NULL, 'kukurydza');
INSERT INTO ingredient VALUES (NULL, 'szynka');
INSERT INTO ingredient VALUES (NULL, 'wołowina');
INSERT INTO ingredient VALUES (NULL, 'mięso wołowo-wieprzowe');
INSERT INTO ingredient VALUES (NULL, 'ryż');
INSERT INTO ingredient VALUES (NULL, 'wino');
INSERT INTO ingredient VALUES (NULL, 'szafran');
INSERT INTO ingredient VALUES (NULL, 'bekon');
INSERT INTO ingredient VALUES (NULL, 'marchewka');
INSERT INTO ingredient VALUES (NULL, 'majonez');
INSERT INTO ingredient VALUES (NULL, 'pomidory');
INSERT INTO ingredient VALUES (NULL, 'salami');
INSERT INTO ingredient VALUES (NULL, 'parmezan');
INSERT INTO ingredient VALUES (NULL, 'pepperoni');
INSERT INTO ingredient VALUES (NULL, 'czosnek');
INSERT INTO ingredient VALUES (NULL, 'boczek');
INSERT INTO ingredient VALUES (NULL, 'feta');
INSERT INTO ingredient VALUES (NULL, 'lazur');
INSERT INTO ingredient VALUES (NULL, 'camambert');
INSERT INTO ingredient VALUES (NULL, 'mascarpone');
INSERT INTO ingredient VALUES (NULL, 'ser grana padano');
INSERT INTO ingredient VALUES (NULL, 'kielbasa Salsiccii');
INSERT INTO ingredient VALUES (NULL, 'bulion');
INSERT INTO ingredient VALUES (NULL, 'mozarella');
INSERT INTO ingredient VALUES (NULL, 'szpinak');
INSERT INTO ingredient VALUES (NULL, 'oliwki');
INSERT INTO ingredient VALUES (NULL, 'ananas');
INSERT INTO ingredient VALUES (NULL, 'kurczak');
INSERT INTO ingredient VALUES (NULL, 'rukola');


-- Pizza
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'pizza margherita', 'https://upload.wikimedia.org/wikipedia/commons/4/41/Pizza_Margherita%2C_at_Restaurant_Gusto_%282013.07.13%29_2.jpg', 'Klasyczna
                                pizza', 12.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'pizza hawajska', 'https://upload.wikimedia.org/wikipedia/commons/d/d1/Hawaiian_pizza_1.jpg', 'Pizza hawajska
                                z ananasem i kurczakiem', 14.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'pizza pepperoni', 'https://upload.wikimedia.org/wikipedia/commons/1/10/Pepperoni_pizza.jpeg', 'Pizza
                                pepperoni dla tych, kto uwielba salami', 16.99);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), '4 sery', 'https://upload.wikimedia.org/wikipedia/commons/e/eb/White_cheese_pizza.jpg', 'Pizza
                                pepperoni dla tych, kto uwielba ser', 16.99);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'pizza'), 'Spinaci', 'https://upload.wikimedia.org/wikipedia/commons/c/c7/Spinach_pizza.jpg', 'Pizza
                                pepperoni dla tych, kto uwielba szpinak', 15.99);


-- Spaghetti
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'spaghetti'), 'Spaghetti carbonara', 'https://upload.wikimedia.org/wikipedia/commons/2/2d/Spaghetti_alla_Carbonara_%28Madrid%29.JPG', 'Danie złożone z makaronu (zwykle spaghetti) oraz sosu powstałego na bazie jajek, czarnego pieprzu, podgardla i zółtego sera', 17.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'spaghetti'), 'Spaghetti bolognese', 'https://upload.wikimedia.org/wikipedia/commons/c/c3/Spaghetti_bolognese.jpg', 'Typowe danie składa się z porcji świeżo ugotowanego makaronu wymieszanego z odpowiednim sosem i opcjonalnie posypanego serem', 17.49);


-- Lasagne
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'lasagne'), 'Lasagne bolognese', 'https://upload.wikimedia.org/wikipedia/commons/1/18/Lasagna_bolognese%2C_February_2012.jpg', 'Danie składa się z warstw prostokątnych płatów makaronów i sosu pomidorowego z mięsem i serem', 18.99);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'lasagne'), 'Lasagne z łososiem i szpinakiem', 'https://upload.wikimedia.org/wikipedia/commons/c/ce/Lasagne%21_%285502264930%29.jpg', 'Lasagne z łososiem i szpinakiem', 18.49);


-- Risotto
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'risotto'), 'Risotto alla milanese', 'https://upload.wikimedia.org/wikipedia/commons/3/3b/Risotto_med_safran_%286977872494%29.jpg', 'Specjalność Mediolanu, przygotowana na bulionie oraz szpiku wołowym, doprawiona szafranem', 15.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'risotto'), 'Risotto al Barolo', 'https://cdn.pixabay.com/photo/2015/03/30/18/43/brown-rice-699836_960_720.jpg', 'Specjalność Piemontu, przygotowana na czerwonym winie, może zawierać mięso i/lub fasolę', 15.49);
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'risotto'), 'Risotto alla pilota', 'https://cdn.pixabay.com/photo/2014/12/04/20/59/risotto-557124_960_720.jpg', 'Specjalność Mantui, przygotowana z kiełbasą, wieprzowiną i serem', 15.49);



-- Ravioli
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'ravioli'), 'Ravioli z serem i szpinakiem',
                                'http://www.trestelle.ca/images/recipes/6247779-RicottaSpinachLemonRavioliBrownButterSauce-1080.jpg', 'Małe pierożki z serem ricotta', 15.49);

INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'ravioli'), 'Ravioli z mięsem', 'https://cdn.pixabay.com/photo/2015/09/30/06/26/meatball-ravioli-964959_960_720.jpg', 'Małe pierożki z mięsem', 15.49);

INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'ravioli'), 'Ravioli ze szpinakiem', 'https://cdn.pixabay.com/photo/2017/05/18/06/31/lamb-2322681_960_720.jpg', 'Małe pierożki ze szpinakiem', 15.49);


-- Piadina
INSERT INTO dish VALUES (NULL, (SELECT id_category
                                FROM category
                                WHERE name_category = 'piadina'), 'Piadina Romagnola', 'https://upload.wikimedia.org/wikipedia/commons/e/e6/Piadina.jpg', 'Płaski, cienki placek wypełniony pysznymi dodatkami', 15.49);



-- Pizza margherita
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza margherita'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza margherita'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'ser corregio'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza margherita'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'oregano'));


-- Pizza hawajska
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
                                                                           WHERE name_ingredient = 'ser corregio'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza hawajska'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'ananas'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza hawajska'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                               WHERE name_ingredient = 'oregano'));

-- Pizza spinaci
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spinaci'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'sos śmietankowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spinaci'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'mozarella'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spinaci'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'szpinak'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spinaci'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'mascarpone'));


-- PIZZA 4 SERY
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = '4 sery'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = '4 sery'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'mozarella'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = '4 sery'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'camambert'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = '4 sery'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'lazur'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = '4 sery'), (SELECT id_ingredient
                                                                             FROM ingredient
                                                                             WHERE name_ingredient = 'feta'));


-- PIZZA PEPPERONI
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza pepperoni'), (SELECT id_ingredient
                                                                            FROM ingredient
                                                                            WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza pepperoni'), (SELECT id_ingredient
                                                                            FROM ingredient
                                                                            WHERE name_ingredient = 'ser corregio'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza pepperoni'), (SELECT id_ingredient
                                                                            FROM ingredient
                                                                            WHERE name_ingredient = 'salami'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'pizza pepperoni'), (SELECT id_ingredient
                                                                            FROM ingredient
                                                                            WHERE name_ingredient = 'oregano'));


-- Spaghetti carbonara
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti carbonara'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'boczek'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti carbonara'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'jajka'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti carbonara'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'śmietana'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti carbonara'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'parmezan'));


-- Spaghetti bolognese
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'wołowina'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'parmezan'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'czosnek'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'oregano'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'bazylia'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Spaghetti bolognese'), (SELECT id_ingredient
                                                                          FROM ingredient
                                                                          WHERE name_ingredient = 'cebula'));





-- Lasagne bolognese
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne bolognese'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE
                                                                             name_ingredient = 'sos pomidorowy'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne bolognese'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'mięso wołowo-wieprzowe'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne bolognese'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'czosnek'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne bolognese'), (SELECT id_ingredient
                                                                      FROM ingredient
                                                                      WHERE name_ingredient = 'cebula'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne bolognese'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'oliwki'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne bolognese'), (SELECT id_ingredient
                                                                           FROM ingredient

                                                          WHERE name_ingredient = 'ser corregio'));


-- Lasagne z lososiem i szpinakiem
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne z łososiem i szpinakiem'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'łosóś'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne z łososiem i szpinakiem'), (SELECT id_ingredient
                                                                           FROM ingredient
                                                                           WHERE name_ingredient = 'szpinak'));

INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne z łososiem i szpinakiem'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'mozarella'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne z łososiem i szpinakiem'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'parmezan'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Lasagne z łososiem i szpinakiem'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'czosnek'));





-- Risotto alla milanese
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla milanese'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'ryż'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla milanese'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'cebula'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla milanese'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'wino'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla milanese'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'ser grana padano'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla milanese'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'szafran'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla milanese'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'bulion'));



-- Risotto al Barolo
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'ryż'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'wino'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'bekon'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'parmezan'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'cebula'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'marchewka'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto al Barolo'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'bulion'));



-- Risotto alla pilota
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla pilota'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'ryż'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla pilota'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'boczek'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla pilota'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'kiełbasa Salsiccii'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla pilota'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'czosnek'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla pilota'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'parmezan'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Risotto alla pilota'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'bulion'));


-- Piadina
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Piadina Romagnola'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'szynka'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Piadina Romagnola'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'mozarella'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Piadina Romagnola'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'majonez'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Piadina Romagnola'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'kukurydza'));
INSERT INTO dish_ingredient VALUES ((SELECT id_dish
                                     FROM dish
                                     WHERE name_dish = 'Piadina Romagnola'), (SELECT id_ingredient
                                                                    FROM ingredient
                                                                    WHERE name_ingredient = 'pomidory'));
