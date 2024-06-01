package com.miccolu.udemy.vertx_starter.eventbus.exampleClass;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.impl.logging.Logger;
import io.vertx.core.impl.logging.LoggerFactory;

public class RequestVerticle extends AbstractVerticle {

  public static final String ADDRESS = "my.request.address";
  private static final Logger LOG = LoggerFactory.getLogger(RequestVerticle.class);
  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    LOG.debug("Sending message: ");
    startPromise.complete();
    vertx.eventBus().request(ADDRESS, "[\n" +
      "  {\n" +
      "    \"_id\": \"665b31ebbeb1437f550732e1\",\n" +
      "    \"index\": 0,\n" +
      "    \"guid\": \"eb52cc96-791f-4309-80ad-95cee88f84e2\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$3,605.28\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 39,\n" +
      "    \"eyeColor\": \"brown\",\n" +
      "    \"name\": \"English Rowe\",\n" +
      "    \"gender\": \"male\",\n" +
      "    \"company\": \"ZEDALIS\",\n" +
      "    \"email\": \"englishrowe@zedalis.com\",\n" +
      "    \"phone\": \"+1 (865) 438-3920\",\n" +
      "    \"address\": \"193 Locust Avenue, Cumberland, Alabama, 9724\",\n" +
      "    \"about\": \"Non ad ad amet amet aliquip. Veniam aliqua aute qui est. Commodo adipisicing qui ex deserunt consectetur. Est dolore fugiat id excepteur deserunt do velit eiusmod non.\\r\\n\",\n" +
      "    \"registered\": \"2018-12-10T11:08:14 +02:00\",\n" +
      "    \"latitude\": -10.465388,\n" +
      "    \"longitude\": -10.557868,\n" +
      "    \"tags\": [\n" +
      "      \"ex\",\n" +
      "      \"quis\",\n" +
      "      \"nulla\",\n" +
      "      \"pariatur\",\n" +
      "      \"minim\",\n" +
      "      \"non\",\n" +
      "      \"commodo\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Lorraine Oconnor\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Mabel Rocha\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Dejesus Sherman\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, English Rowe! You have 1 unread messages.\",\n" +
      "    \"favoriteFruit\": \"strawberry\"\n" +
      "  },\n" +
      "  {\n" +
      "    \"_id\": \"665b31eb4a5c48a5560ef583\",\n" +
      "    \"index\": 1,\n" +
      "    \"guid\": \"0fa63bba-e6b6-4992-956f-e7079f32ff48\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$1,867.02\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 22,\n" +
      "    \"eyeColor\": \"green\",\n" +
      "    \"name\": \"Raymond Obrien\",\n" +
      "    \"gender\": \"male\",\n" +
      "    \"company\": \"EARGO\",\n" +
      "    \"email\": \"raymondobrien@eargo.com\",\n" +
      "    \"phone\": \"+1 (824) 498-2175\",\n" +
      "    \"address\": \"614 Turnbull Avenue, Ripley, Virgin Islands, 1773\",\n" +
      "    \"about\": \"Proident do amet id excepteur minim ipsum ad irure laborum. Anim culpa laborum id dolore cillum qui nisi. Aute do esse exercitation labore enim esse ipsum voluptate Lorem ipsum. Tempor cupidatat Lorem exercitation aute irure. Tempor ipsum sunt dolor eu ad. Quis voluptate ea Lorem dolore ut amet deserunt qui.\\r\\n\",\n" +
      "    \"registered\": \"2014-05-17T02:58:25 +03:00\",\n" +
      "    \"latitude\": 44.885063,\n" +
      "    \"longitude\": 101.518886,\n" +
      "    \"tags\": [\n" +
      "      \"dolor\",\n" +
      "      \"ex\",\n" +
      "      \"ipsum\",\n" +
      "      \"culpa\",\n" +
      "      \"nisi\",\n" +
      "      \"aute\",\n" +
      "      \"nulla\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Pearl Burris\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Montgomery Lang\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Gilbert Drake\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, Raymond Obrien! You have 7 unread messages.\",\n" +
      "    \"favoriteFruit\": \"banana\"\n" +
      "  },\n" +
      "  {\n" +
      "    \"_id\": \"665b31eb30f93dc0ad39a05a\",\n" +
      "    \"index\": 2,\n" +
      "    \"guid\": \"e06da835-86dc-4d46-9580-165b564753fd\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$3,746.02\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 20,\n" +
      "    \"eyeColor\": \"green\",\n" +
      "    \"name\": \"Darla Mcmillan\",\n" +
      "    \"gender\": \"female\",\n" +
      "    \"company\": \"NEPTIDE\",\n" +
      "    \"email\": \"darlamcmillan@neptide.com\",\n" +
      "    \"phone\": \"+1 (986) 477-2196\",\n" +
      "    \"address\": \"300 Ide Court, Waumandee, Illinois, 9345\",\n" +
      "    \"about\": \"Eu quis cupidatat proident deserunt excepteur aliqua cillum voluptate sunt minim. Aliqua consequat sunt cillum dolor id officia ad aute sit Lorem labore. Laboris Lorem sint elit adipisicing ipsum sint ea non cupidatat cupidatat est. Ex excepteur elit eu ipsum Lorem nisi anim exercitation cillum ut.\\r\\n\",\n" +
      "    \"registered\": \"2019-08-11T10:56:19 +03:00\",\n" +
      "    \"latitude\": -47.540582,\n" +
      "    \"longitude\": -148.351281,\n" +
      "    \"tags\": [\n" +
      "      \"sunt\",\n" +
      "      \"do\",\n" +
      "      \"consectetur\",\n" +
      "      \"ad\",\n" +
      "      \"ipsum\",\n" +
      "      \"anim\",\n" +
      "      \"quis\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Concepcion Meyers\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Meredith Watts\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Loraine Whitney\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, Darla Mcmillan! You have 3 unread messages.\",\n" +
      "    \"favoriteFruit\": \"strawberry\"\n" +
      "  },\n" +
      "  {\n" +
      "    \"_id\": \"665b31eb8ac268ad9043a35e\",\n" +
      "    \"index\": 3,\n" +
      "    \"guid\": \"a072ae51-8be3-49df-9846-c5c548da9802\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$3,887.83\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 28,\n" +
      "    \"eyeColor\": \"brown\",\n" +
      "    \"name\": \"Jessica Howell\",\n" +
      "    \"gender\": \"female\",\n" +
      "    \"company\": \"APPLICA\",\n" +
      "    \"email\": \"jessicahowell@applica.com\",\n" +
      "    \"phone\": \"+1 (815) 542-3507\",\n" +
      "    \"address\": \"213 Independence Avenue, Jackpot, Missouri, 2677\",\n" +
      "    \"about\": \"Cillum est commodo in ullamco est adipisicing quis nostrud. Deserunt commodo ullamco commodo proident duis in ad deserunt do ullamco. In voluptate sint Lorem in consectetur.\\r\\n\",\n" +
      "    \"registered\": \"2019-01-25T01:52:17 +02:00\",\n" +
      "    \"latitude\": 48.499223,\n" +
      "    \"longitude\": 27.523119,\n" +
      "    \"tags\": [\n" +
      "      \"aliqua\",\n" +
      "      \"eiusmod\",\n" +
      "      \"reprehenderit\",\n" +
      "      \"laborum\",\n" +
      "      \"commodo\",\n" +
      "      \"labore\",\n" +
      "      \"dolor\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Iris Gentry\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Claudine Maynard\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Julia Greene\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, Jessica Howell! You have 3 unread messages.\",\n" +
      "    \"favoriteFruit\": \"apple\"\n" +
      "  },\n" +
      "  {\n" +
      "    \"_id\": \"665b31eb661cd386a15f0d3d\",\n" +
      "    \"index\": 4,\n" +
      "    \"guid\": \"2424c53c-2147-4aaf-a879-ffe26e92640a\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$3,211.45\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 29,\n" +
      "    \"eyeColor\": \"blue\",\n" +
      "    \"name\": \"Dena Payne\",\n" +
      "    \"gender\": \"female\",\n" +
      "    \"company\": \"PYRAMIA\",\n" +
      "    \"email\": \"denapayne@pyramia.com\",\n" +
      "    \"phone\": \"+1 (951) 474-3740\",\n" +
      "    \"address\": \"199 Arlington Avenue, Downsville, Massachusetts, 3570\",\n" +
      "    \"about\": \"Sunt aliquip magna Lorem consectetur voluptate ad. Dolor ullamco ipsum ex fugiat. Labore mollit reprehenderit dolor voluptate sit est reprehenderit. Veniam amet reprehenderit veniam aute dolor do elit fugiat non amet. Reprehenderit irure quis laborum amet aliqua eu sit. Dolor eiusmod labore dolor qui consectetur ea cupidatat exercitation ex aute. Eu aliqua deserunt est sunt ipsum duis ea minim eu.\\r\\n\",\n" +
      "    \"registered\": \"2019-01-16T11:46:18 +02:00\",\n" +
      "    \"latitude\": -23.278394,\n" +
      "    \"longitude\": -137.252575,\n" +
      "    \"tags\": [\n" +
      "      \"ipsum\",\n" +
      "      \"nulla\",\n" +
      "      \"do\",\n" +
      "      \"ex\",\n" +
      "      \"eu\",\n" +
      "      \"duis\",\n" +
      "      \"cupidatat\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Bean Nieves\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Cain Torres\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Leblanc Mcpherson\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, Dena Payne! You have 3 unread messages.\",\n" +
      "    \"favoriteFruit\": \"strawberry\"\n" +
      "  },\n" +
      "  {\n" +
      "    \"_id\": \"665b31eb5f95e8e85b9d064c\",\n" +
      "    \"index\": 5,\n" +
      "    \"guid\": \"24d13f97-943a-490d-8368-73c2656b4eae\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$1,486.73\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 30,\n" +
      "    \"eyeColor\": \"green\",\n" +
      "    \"name\": \"Cochran Neal\",\n" +
      "    \"gender\": \"male\",\n" +
      "    \"company\": \"RODEOLOGY\",\n" +
      "    \"email\": \"cochranneal@rodeology.com\",\n" +
      "    \"phone\": \"+1 (934) 486-3373\",\n" +
      "    \"address\": \"977 Amber Street, Onton, New Hampshire, 9491\",\n" +
      "    \"about\": \"Velit occaecat ea sit minim. Mollit duis veniam consectetur sunt nisi nulla sit non deserunt consectetur sunt ut. Adipisicing excepteur dolor eiusmod sint. Fugiat aliquip culpa voluptate culpa do irure consequat. Ex velit commodo minim mollit incididunt et ad proident laboris dolor laboris duis eiusmod. Qui irure dolore magna incididunt mollit pariatur consequat labore aute incididunt ad nulla reprehenderit. Enim laborum ex nostrud proident cupidatat cillum nostrud tempor.\\r\\n\",\n" +
      "    \"registered\": \"2024-02-05T02:47:18 +03:00\",\n" +
      "    \"latitude\": -52.770593,\n" +
      "    \"longitude\": -139.985742,\n" +
      "    \"tags\": [\n" +
      "      \"eu\",\n" +
      "      \"pariatur\",\n" +
      "      \"exercitation\",\n" +
      "      \"voluptate\",\n" +
      "      \"consequat\",\n" +
      "      \"labore\",\n" +
      "      \"consectetur\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Cole Villarreal\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Kimberley Oneal\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Letitia Alford\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, Cochran Neal! You have 7 unread messages.\",\n" +
      "    \"favoriteFruit\": \"banana\"\n" +
      "  },\n" +
      "  {\n" +
      "    \"_id\": \"665b31eb70eeb2edb002393c\",\n" +
      "    \"index\": 6,\n" +
      "    \"guid\": \"7de637e4-c1be-4df6-8c47-8cb0b2b3fa5f\",\n" +
      "    \"isActive\": true,\n" +
      "    \"balance\": \"$1,267.35\",\n" +
      "    \"picture\": \"http://placehold.it/32x32\",\n" +
      "    \"age\": 22,\n" +
      "    \"eyeColor\": \"blue\",\n" +
      "    \"name\": \"Manning Patel\",\n" +
      "    \"gender\": \"male\",\n" +
      "    \"company\": \"PETIGEMS\",\n" +
      "    \"email\": \"manningpatel@petigems.com\",\n" +
      "    \"phone\": \"+1 (838) 560-2085\",\n" +
      "    \"address\": \"299 Jerome Street, Gadsden, Texas, 8518\",\n" +
      "    \"about\": \"Ad laborum est ut veniam Lorem consectetur fugiat culpa commodo. Culpa aliquip fugiat proident mollit laboris enim ex est et amet enim cillum. Nulla labore labore esse enim veniam ex.\\r\\n\",\n" +
      "    \"registered\": \"2017-08-31T08:52:05 +03:00\",\n" +
      "    \"latitude\": -30.075924,\n" +
      "    \"longitude\": -22.2206,\n" +
      "    \"tags\": [\n" +
      "      \"id\",\n" +
      "      \"pariatur\",\n" +
      "      \"elit\",\n" +
      "      \"aliqua\",\n" +
      "      \"cillum\",\n" +
      "      \"nostrud\",\n" +
      "      \"deserunt\"\n" +
      "    ],\n" +
      "    \"friends\": [\n" +
      "      {\n" +
      "        \"id\": 0,\n" +
      "        \"name\": \"Maricela Stein\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 1,\n" +
      "        \"name\": \"Lott Bridges\"\n" +
      "      },\n" +
      "      {\n" +
      "        \"id\": 2,\n" +
      "        \"name\": \"Bruce Steele\"\n" +
      "      }\n" +
      "    ],\n" +
      "    \"greeting\": \"Hello, Manning Patel! You have 3 unread messages.\",\n" +
      "    \"favoriteFruit\": \"strawberry\"\n" +
      "  }\n" +
      "]", reply -> {
      reply.result().body();
    });
  }
}
