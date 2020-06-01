create database Videojuegos;
use Videojuegos;
/*Aqui van las tablas*/
create table CPlataforma(id_cp INT NOT NULL PRIMARY KEY, tipo_plataforma VARCHAR(45) NOT NULL);
create table CClasificaciones (id_cc INT NOT NULL PRIMARY KEY, tipo_clasificacion VARCHAR(45) NOT NULL);
create table Videojuego (id_video INT NOT NULL PRIMARY KEY, Nombre VARCHAR(70) NOT NULL, Precio DOUBLE NOT NULL, Descripcion VARCHAR(1000) NOT NULL, Edicion VARCHAR(45) NOT NULL, Imagen VARCHAR(200) NOT NULL, Anio INT NOT NULL, id_genero INT NOT NULL, id_cc INT NOT NULL, id_cp INT NOT NULL);
create table Inventario(id_inv INT NOT NULL PRIMARY KEY, Cantidad_inv INT NOT NULL, id_video INT NOT NULL);
create table Ticket(id_ticket INT NOT NULL PRIMARY KEY, Nombre_servicio VARCHAR(45) NOT NULL, Fecha DATE NOT NULL, Subtotal DOUBLE NOT NULL, Envio DOUBLE NOT NULL, Impuestos DOUBLE NOT NULL, Total DOUBLE NOT NULL, id_venta INT NOT NULL);
create table Venta(id_venta INT NOT NULL PRIMARY KEY, id_video INT NOT NULL);
create table Historial(id_historial INT NOT NULL PRIMARY KEY, id_ticket INT NOT NULL);
create table Cliente (id_cliente INT NOT NULL PRIMARY KEY AUTO_INCREMENT, Nombre VARCHAR (45) NOT NULL, Apellido VARCHAR(45), Email VARCHAR(76) NOT NULL, Pass VARCHAR(45) NOT NULL, Dir_entrega VARCHAR(150) NOT NULL,  Nivel INT, id_cmp INT, id_venta INT, id_historial INT);
create table CMetodoPago(id_cmp INT NOT NULL PRIMARY KEY, tipo_pago VARCHAR(45) NOT NULL);
create table CGenero (id_genero INT NOT NULL PRIMARY KEY, tipo_genero VARCHAR(45) NOT NULL);
/*Aqui se agregaron las llaves foraneas*/
alter table Videojuego ADD CONSTRAINT fk_CPlataforma FOREIGN KEY (id_cp) REFERENCES CPlataforma (id_cp);
alter table Videojuego ADD CONSTRAINT fk_CClasificaciones FOREIGN KEY (id_cc) REFERENCES CClasificaciones (id_cc);
alter table Videojuego ADD CONSTRAINT fk_CGenero FOREIGN KEY (id_genero) REFERENCES CGenero (id_genero);

alter table Inventario ADD CONSTRAINT fk_Videojuego FOREIGN KEY (id_video) REFERENCES Videojuego (id_video);

alter table Venta ADD CONSTRAINT fk_VideojuegoV FOREIGN KEY (id_video) REFERENCES Videojuego (id_video);

alter table Ticket ADD CONSTRAINT fk_Venta FOREIGN KEY (id_venta) REFERENCES Venta (id_venta);

alter table Historial ADD CONSTRAINT fk_Ticket FOREIGN KEY (id_ticket) REFERENCES Ticket (id_ticket);

alter table Cliente ADD CONSTRAINT fk_Historial FOREIGN KEY (id_historial) REFERENCES Historial (id_historial);
alter table Cliente ADD CONSTRAINT fk_VentaC FOREIGN KEY (id_venta) REFERENCES Venta (id_venta);
alter table Cliente ADD CONSTRAINT fk_CMetodoPago FOREIGN KEY (id_cmp) REFERENCES CMetodoPago (id_cmp);

/*Aqui van a ir los registros basicos para que funcione el programa*/
insert into CMetodoPago values (1, "PayPal");
insert into CMetodoPago values (2, "Tarjeta");
insert into CMetodoPago values (3, "Efectivo");

insert into CPlataforma values (1, "PS4");
insert into CPlataforma values (2, "Xbox One");
insert into CPlataforma values (3, "Nintendo Switch");
insert into CPlataforma values (4, "PC");
insert into CPlataforma values (5, "Xbox 360");
insert into CPlataforma values (6, "PS3");

insert into CGenero values (1, "Plataformas");
insert into CGenero values (2, "Mundo abierto");
insert into CGenero values (3, "Disparos");
insert into CGenero values (4, "Accion y aventura");
insert into CGenero values (5, "Peleas");
insert into CGenero values (6, "Juegos de rol");
insert into CGenero values (7, "Carreras");

insert into CClasificaciones values (1, "Everyone 10+");
insert into CClasificaciones values (2, "Teen 13+");
insert into CClasificaciones values (3, "Maduro 17+");
insert into CClasificaciones values (4, "Adultos 18+");

insert into Videojuego values (1, 
"Mortal Kombat 11 Xbox One",
799.20,
"Encuentra el Mortal Kombat 11 Xbox One un juego que te permite profundizar en la experiencia como nunca antes, podrás personalizar a tus combatientes favoritos, además de crear una lista con los personajes; esta épica saga continúa con un juego que a pesar de mantener el estilo clásico que lo caracteriza se renueva en cada versión agregando complementos que convierten la experiencia en una impresionante. Este Mortal Kombat 11 Xbox One es la opción más adecuada para ti pues pasarás horas de entretenimiento, juega en solitario o en compañía de un amigo y diviértete con su apasionante historia",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.9688.70804610839547354.8da93c46-fd13-4b16-8ebe-e8e02c53d93e.09c2e91e-28bd-4f6f-bfd6-79d6b241667a?mode=scale&q=90&h=300&w=200",
2019,
5,
3,
1
);
insert into Videojuego values (2,
"Call Of Duty Modern Warfare",
1400,
"Lo que está en juego es más importante que nunca cuando los jugadores asumen el papel de los letales operadores de primer nivel en una emocionante saga que afectará al equilibrio de poder mundial. Call of Duty: Modern Warfare envuelve a los aficionados en una narrativa increíblemente cruda, descarnada y provocativa que ofrece una intensidad sin iguales y destaca la naturaleza cambiante de la guerra moderna. Desarrollado por el estudio que lo inició todo, Infinity Ward ofrece una reimaginación épica totalmente nueva de la icónica serie Modern Warfare.",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.50528.68332208580498659.9222b095-8101-4531-b386-33547ee9944f.948f2c50-2f29-43df-9557-4670f69840d1?mode=scale&q=90&h=300&w=200&background=%23FFFFFF",
2019,
3,
3,
2
);
insert into Videojuego values (3,
"Ori And The Will Of The Wisps Xbox One Collector’s Edition",
959.20,
"Embarca en una nueva aventura en un amplio y exótico mundo en el que te enfrentarás a imponentes enemigos y desafiantes rompecabezas en tu búsqueda para descubrir el destino de Ori.",
"Coleccionista",
"https://store-images.s-microsoft.com/image/apps.18799.14047496556148589.9fda5cef-7995-4dbb-a626-66d2ab3feb4f.1e167626-8b7d-47b4-9fe5-d06a43ac6677",
2020,
4,
1,
2
);
insert into Videojuego values (4,
"Batman: Return to Arkham",
349,
"Regresa a Arkham y disfruta con dos de los títulos más aclamados por la crítica: Batman: Arkham Asylum y Batman: Arkham City, con efectos visuales remasterizados y actualizados. Juega como Batman y utiliza una gran variedad de dispositivos y habilidades para derrotar a los más grandes villanos de Ciudad Gótica . Batman: Return to Arkham incluye las versiones completas de ambos juegos y todo el contenido adicional publicado anteriormente.",
"Return to Arkham",
"https://store-images.s-microsoft.com/image/apps.4236.69416119090354959.ca15c348-6558-4128-b5ac-5395efde71c8.45bf3c53-26df-4846-8401-c09b6070aa44?mode=scale&q=90&h=300&w=200&background=%23FFFFFF",
2016,
4,
2,
1
);
insert into Videojuego values (5,
"Final Fantasy VII Remake",
1359.99,
"El mundo está controlado por la compañía Shinra, una corporación que genera energía mako a partir de la fuerza vital del planeta. En la ciudad de Midgar, el grupo anti-Shinra Avalancha decide tomar medidas drásticas. Cloud Strife, exmiembro de la unidad de élite de Shinra conocida como Soldado, ofrece sus servicios de mercenario a Avalancha, desconocedor de las aventuras que le esperan.",
"Estandar",
"https://media.playstation.com/is/image/SCEA/final-fantasy-vii-remake-demo-store-art-01-ps4-02mar20-en-us?$native_nt$",
2020,
6,
2,
1
);
insert into Videojuego values (6,
"Need For Speed Heat",
895.66,
"Gánate la vida de día y arriésgalo todo de noche en Need for Speed™ Heat, una emocionante experiencia de carreras en la que te enfrentas a la policía corrupta de una ciudad mientras luchas por alcanzar la elite de las carreras callejeras.",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.25499.69435230515002378.5c54c210-6100-4e84-81d0-b92a5aadc00d.621c04a4-1dba-4507-9975-15242516a0a3?mode=scale&q=90&h=300&w=200",
2019,
7,
2,
2
);
insert into Videojuego values (7,
"DARK SOULS II: Scholar of the First Sin",
575,
"DARK SOULS II: Scholar of the First Sin lleva la característica oscuridad de la franquicia y su apasionante jugabilidad a un nuevo nivel. Únete al oscuro viaje y experimenta los sobrecogedores encuentros con enemigos, los peligros diabólicos y los desafíos implacables.",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.2435.71415569152440938.6739ca29-cd37-4678-ab4c-9de7eea4d902.ebef4dc5-7000-4381-aeb3-ec706fb63c03?mode=scale&q=90&h=300&w=200",
2014,
6,
2,
5
);
insert into Videojuego values (8,
"Playerunknowns Battlegrounds",
597,
"La versión completa del producto incluye 3 mapas: el mapa del juego original, Erangel, el mapa temático de desierto, Miramar, y el nuevo mapa temático de trópicos, Sanhok, con armas y vehículos totalmente nuevos. La versión preliminar termina. Ahora, es el juego de cualquiera.",
"Estandar",
"https://s1.gaming-cdn.com/images/products/1995/orig/playerunknowns-battlegrounds-cover.jpg",
2019,
3,
2,
4
);
insert into Videojuego values (9,
"Journey to the Savage Planet",
350.99,
"En este juego de aventuras en primera persona, optimista y colorido, juegas como el nuevo recluta de Kindred Aerospace. Enviado a un planeta inexplorado con poco equipo y sin un plan real, debes explorar, catalogar y determinar si este planeta es apto para que los humanos puedan habitarlo.",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.28465.64018774417873828.42c2f71f-f575-4f9b-aa08-dc41fe05171e.f17c14ed-3c1e-4d64-8ca5-f5df194aa6f4?mode=scale&q=90&h=300&w=200",
2015,
4,
2,
3
);
insert into Videojuego values (10,
"Sekiro Shadows Die Twice",
1399.90,
"Forja tu propio camino en busca de la venganza en una nueva aventura del desarrollador From Software, responsable de Bloodborne y la serie Dark Souls. En Sekiro: Shadows Die Twice encarnas al \lobo manco\, un guerrero desfigurado y caído en desgracia que ha sido rescatado al borde de la muerte. Tras jurar proteger a un joven señor descendiente de un antiguo linaje, te conviertes en el objetivo de despiadados enemigos, entre ellos el peligroso clan Ashina. Cuando el joven señor es capturado, nada te detendrá en tu peligrosa aventura por restituir tu honor, ni siquiera la muerte.",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.50432.69038865179152125.af885fa8-7b94-47b1-be3a-d2ab6af95a6a.c33c3798-0863-4898-b436-ff5050ffebd1?mode=scale&q=90&h=300&w=200",
2019,
4,
3,
1
);
insert into Videojuego values (11,
"Super Mario Odyssey",
1399,
"Esta aventura 3D de Mario de estilo \"sandbox\" está llena a reventar de secretos y sorpresas.
Explora enormes reinos 3D llenos de secretos y sorpresas, incluidos atuendos para Mario y montones de maneras diferentes de interactuar con el entorno.
Gracias a su nuevo amigo Cappy, Mario tiene nuevos movimientos, como lanzamiento de sombrero, Salto Sombrero o captura.
Visite nuevos lugares asombrosos, como New Donk City repleto de rascacielos, y encuéntrese con amigos familiares y enemigos mientras trata de salvar a la princesa Peach de las garras de Bowser y frustrar sus planes de boda cobardes.",
"Estandar",
"https://images-na.ssl-images-amazon.com/images/I/518mL2i0riL._AC_.jpg",
2017,
1,
1,
3
);
insert into Videojuego values (12,
"Call of Duty Black Ops III",
750,
"tiene lugar en un futuro distópico, situado en 2065, donde la ciencia y la tecnología han cambiado radicalmente a la especie humana, con una sociedad violenta y multitud de protestas tratando de detener el progreso de la tecnología. La tecnología militar ha avanzado hasta un punto en que la robótica juega un papel principal, y se han desarrollado supersoldados.",
"Estandar",
"https://store-images.s-microsoft.com/image/apps.7208.68678970150079696.6bf4fb5c-7bd7-4b8c-afde-c7bdc81ee49f.3d56c96b-108b-481a-a638-484da2a5d2e1?w=180&h=270&q=60",
2015,
3,
4,
1
);
insert into Videojuego values (13,
"Halo 5 Guardians",
500,
"Una fuerza imparable amenaza la galaxia y el Jefe Mestro está perdido. Una historia épica y dos nuevos modos multijugador que marcan la más grande evolución en la historia de Halo. Zona de guerra es un modo multijugador a escala masiva completamente nuevo que soporta batallas de 24 jugadores con aliados y enemigos de la IA que aparecen constantemente para mejorar la experiencia. Es una batalla sin cuartel contra Spartans, Covenants y Forerunners a medida que intentas completar diversos objetivos. Esta entrega de Halo incluye Modo Cooperativo. Tu equipo es tu arma: elige como completarás tus objetivos mientras juegas por tu cuenta con tus amigos en una experiencia cooperativa de hasta 4 jugadores.",
"Estandar",
"https://images-na.ssl-images-amazon.com/images/I/71jUlLTTl3L._AC_SL1380_.jpg",
2015,
3,
2,
2
);
insert into Videojuego values (14,
"Gears of War 5",
1800,
"Campaña: el mundo se desmorona. El enjambre ha corrompido al ejercito robot de la coalición y está descendiendo a las ciudades humanas. Con el peligro acercándose Kait Díaz se aparta para descubrir su conexión con el enemigo y descubre el verdadero peligro para Sera - ella misma.

Escape: Corre más rápido antes que explote la bomba, sé más astuto que el enjambre, ¡y escapa de la colmena! Escape es un modo cooperativo nuevo, agresivo y de alto riesgo con un escuadrón suicida de tres jugadores que deben trabajar juntos para eliminar a las colmenas enemigas desde dentro. 

Versus: ¡Que gane el mejor equipo! Acumula puntos e intercambia armas superiores en Arcade, una lista de reproducción frenética creada para dar un salto sobre la diversión. 

Horda: Sobrevive usando nuevas habilidades de héroe, construyendo defensas, recogiendo poder, subiendo de nivel tus habilidades y trabajando en equipo.

Constructor de mapas: Crea mapas personalizados de escape de colmena y experiencias.",
"Ultimate Edition",
"https://store-images.s-microsoft.com/image/apps.50620.14140885276228792.8cf3687b-fb9d-4c18-8d80-0df9033e4fc8.4ee5b39d-512b-428d-b5cc-03cdd19eaf88",
2019,
4,
3,
2
);
insert into Videojuego values (15,
"Overwatch",
1200,
"Entra a los campos de batalla con un espectacular reparto de héroes, soldados, científicos, aventureros y seres increíbles equipados con grandes poderes y armas extraordinarias, Acelera y cambia la velocidad del flujo del tiempo, asedia como un cazador a tu presa y desata todos tus poderes, cada héroe cuenta con una habilidad única que le permite cambiar el tablero a su favor con la jugada correcta

Disfruta la individualidad de jugar con héroes y no con clases, cada personaje tiene una perspectiva diferente en el campo de batalla, cura a tus aliados, devasta a tus enemigos con impresionante poder de fuego, espera en las sombras y acaba con quien se descuide, la decisión y el arte del combate son tuyos en este shooter de equipo que te dará una experiencia como ninguna, crea con tus amigos un equipo imbatible, con características únicas y aplasta a la competencia en el juego en línea.",
"Origins Edition",
"https://as01.epimg.net/meristation/imagenes/2019/09/05/game_cover/974564061567671841.jpg",
2016,
3,
2,
1
);
insert into Videojuego values (16,
"Destiny 2",
1000,
"El popular juego de disparos en primera persona, Destiny 2 regresa ahora para PS4. El shooter multijugdor vuelve a lo grande con una nueva historia, gráficos mejorados y personajes más completos.

Para salvar a la humanidad los jugadores deben atravesar todo el sistema solar analizando planetas inexplorados para encontrar armas nuevas y preparar estrategias de combate para derrotar a la Legión Roja.

Disfruta de sus escenas alucinantes, y apasiónate en una aventura de gran calidad con gráficos sorprendentes con Destiny 2.",
"Estandar",
"https://vignette.wikia.nocookie.net/destiny/images/c/c3/Destiny_2.jpg/revision/latest?cb=20170905215729&path-prefix=es",
2017,
3,
2,
2
);
insert into Videojuego values (17,
"Minecraft",
880,
"Su plataforma te sitúa en el mundo que prefieras, desde las llanuras más áridas, hasta el bosque más frío, donde perfeccionas tus habilidades para recolectar materiales y alimentos que te ayudarán a sobrevivir y combatir a las criaturas malvadas como Creepers, Zombies y Endermans. 

Pertenece al género de fantasía y violencia, idea para niños de 10 años de edad y más. ¡Pon a prueba tu creatividad en Minecraft!",
"Xbox One Edition",
"https://www.minecraft.net/content/dam/games/minecraft/key-art/Games_Subnav_Minecraft-300x465.jpg",
2009,
2,
1,
2
);
insert into Videojuego values (18,
"Borderlands 3",
1000,
"¡Vuelve el padre de los shooter-looter, con una aventura caótica y tropecientas mil armas! Arrasa a tus enemigos y descubre mundos inéditos con uno de los cuatro nuevos buscacámaras, los cazatesoros cabronazos más duros de Borderlands, que podrás personalizar y desarrollar a través de sus distintos árboles de habilidades. Juega solo o con amigos para derribar a adversarios increíbles, hacerte con un montón de botín y salvar tu hogar de la secta más cruel de la galaxia.",
"Super Deluxe Edition",
"https://cdn.2kgames.com/web/borderlands.com/b3/fob_oak_sup_M_1_huKy5bR.jpg",
2019,
3,
3,
4
);

insert into Venta values(1, 1);

insert into Inventario values (1, 100, 1);

insert into Cliente (Nombre, Apellido, Email, Pass, Dir_entrega, Nivel) values ("admin", "admin", "Administrador_general", "nom3lo", "direccion", 1);