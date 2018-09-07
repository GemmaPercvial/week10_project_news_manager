package db;

import models.Article;
import models.Category;
import models.Journalist;
import models.Location;

import java.util.*;

public class Seeds {
    public static void seedData() {

        // -------------------------Seed Categories ---------------------------------------------------
        Category categoryCrime = new Category("Crime");
        DBHelper.save(categoryCrime);
        Category categoryObituary = new Category("Obituary");
        DBHelper.save(categoryObituary);
        Category categoryPropaganda = new Category("Propaganda");
        DBHelper.save(categoryPropaganda);
        Category categoryFakeNews = new Category("FakeNews");
        DBHelper.save(categoryFakeNews);
        Category categoryOuterSpace = new Category("Outer Space");
        DBHelper.save(categoryOuterSpace);
        Category categoryLocalHero = new Category("Local Hero");
        DBHelper.save(categoryLocalHero);
        Category categoryScience = new Category("Science");
        DBHelper.save(categoryScience);
        Category categoryBusiness = new Category("Business");
        DBHelper.save(categoryBusiness);
        Category categoryEntertainment = new Category("Entertainment");
        DBHelper.save(categoryEntertainment);
        Category categoryFoodDrink = new Category("Food and Drink");
        DBHelper.save(categoryFoodDrink);


        // -------------------------Seed Journalists----------------------------------------------------

        Journalist journalistMonkey86 = new Journalist("Monkey 86", "Drove to Spain after nicking a car from a magician he used to work for");
        DBHelper.save(journalistMonkey86);
        Journalist alfredTheMonkey = new Journalist("Alfred The Monkey", "Intercepted a bank robber(mid-heist) and made off with his loot before returning to his zoo to try and negotiate the release of the other chimps");
        DBHelper.save(alfredTheMonkey);
        Journalist marty = new Journalist("Marty", "The web-using monkey you can supposedly have a chat with over the internet");
        DBHelper.save(marty);
        Journalist ham = new Journalist("Ham", "The first monkey to be sent into space. According to Karl, when he pressed the 'left button' he gets a banana. Also, according to Karl, within the spaceship there are left, right, and reverse buttons");
        DBHelper.save(ham);
        Journalist jack = new Journalist("Jack", " a monkey (actually a baboon) that got pal-ly with a bloke who worked in a railway station. Jack took over when the bloke lost a leg");
        DBHelper.save(jack);
        Journalist jenny = new Journalist("Jenny", "The New York Fire Department's Monkey");
        DBHelper.save(jenny);
        Journalist enos = new Journalist("Enos", "The second monkey to go into space, following Ham's successful mission. In real life, the rocket did not sustain proper altitude and the mission had to be aborted so Enos was returned safely to Earth. In Karl's world, the two buttons became reversed so the one for everything else began dispensing bananas. Fortunately, Enos figured it out and is now living in a monkey retirement home with Ham and all the other Chmiponauts, talking about the old times and that");
        DBHelper.save(enos);
        Journalist ollieTheChimp = new Journalist("Ollie The Chimp", "Ollie was a chimpanzee suspected to be a missing link between humans and apes. In Karl's world, Ollie befriended a zoo-keeper who took him out for dinners and eventually let him live with him. Ollie would start the day with a cuppa tea, end on a brandy, and in the end of the story run off with the zoo-keeper's wife, leaving him a lonely divorcee.");
        DBHelper.save(ollieTheChimp);

        // -------------------------Seed Locations-----------------------------------------------------
        Location locationLocal = new Location("Local");
        DBHelper.save(locationLocal);
        Location locationJungle = new Location("Jungle");
        DBHelper.save(locationJungle);
        Location locationOuterSpace = new Location("Outer Space");
        DBHelper.save(locationOuterSpace);
        Location locationWorld = new Location("World");
        DBHelper.save(locationWorld);
        Location locationZoo = new Location("Zoo");
        DBHelper.save(locationZoo);
        Location locationAir = new Location("Air");
        DBHelper.save(locationAir);


        // -------------------------Seed Time & Date----------------------------------------------------------
        GregorianCalendar currentTimeAndDate = new GregorianCalendar();
        //Months start at 0. e.g. Jan = 0.
        GregorianCalendar dateS01E01 = new GregorianCalendar(2018, 7, 12, 16, 35, 00);
        GregorianCalendar dateS01E02 = new GregorianCalendar(2017, 7, 15, 13, 30, 00);
        GregorianCalendar dateS01E03 = new GregorianCalendar(2018, 7, 24, 11, 30, 00);
        GregorianCalendar dateS01E04 = new GregorianCalendar(2018, 7, 30, 9, 20, 00);
        GregorianCalendar dateS01E05 = new GregorianCalendar(2018, 7, 30, 9, 45, 00);
        GregorianCalendar dateS01E06 = new GregorianCalendar(2018, 7, 30, 9, 30, 00);
        GregorianCalendar dateS01E07 = new GregorianCalendar(2014, 7, 16, 16, 30, 00);
        GregorianCalendar dateS01E08 = new GregorianCalendar(2018, 7, 20, 16, 30, 00);
        GregorianCalendar dateS01E09 = new GregorianCalendar(2018, 7, 24, 16, 30, 00);
        GregorianCalendar dateS01E10 = new GregorianCalendar(2018, 4, 6, 16, 30, 00);
        GregorianCalendar dateS01E011 = new GregorianCalendar(2018, 7, 29, 16, 30, 00);
        GregorianCalendar dateS01E012 = new GregorianCalendar(2006, 1, 20, 16, 30, 00);
        GregorianCalendar dateS03E06 = new GregorianCalendar(2005, 1, 27, 16, 30, 00);

        // -------------------------Seed Article---------------------------------------------------
        Article articles01e01 = new Article("Monkey In space", alfredTheMonkey, categoryOuterSpace, locationOuterSpace, dateS01E01,
                "Monkey wasn't allowed to go back in space, ends up committing suicide because couldn't reach the buzz similar to space traveling any other way",
                "Ricky introduces the regular feature, Monkey News. Steve cues the jingle and Ricky obliges. Karl begins to speak of the first thing in space -- Armstrong gets the glory, but there was a monkey first (Note: His actual name was Ham). Laika the dog is mentioned, but Karl dismisses it. The banana dispenser is explained in full. Karl parries all of Steve and Ricky's initial inquiries and moves on. After the monkey launches the rocket, he begins his journey into space. The mission is accomplished and he reverses back to Earth. The celebration is short-lived, because the monkey was never able to return to space, grew despondent (as evidenced by its demeanour) and eventually killed itself. Ricky dismisses all of this as absolute bollocks.");
        DBHelper.save(articles01e01);

        Article articles01e02 = new Article("Monkey Bargain Hunter", marty, categoryBusiness, locationLocal, dateS01E02,
                "Monkey Bargain hunter", "Karl speaks of an experiment where monkeys are taught the value of money in San Francisco. The monkeys were given about five quid. Some came back with little. The last one came back with a lot, so the receipts were examined. Apparently, he went for the slightly older food that was cheaper. Ricky is not having it and berates Karl.Karl speaks of an experiment where monkeys are taught the value of money in San Francisco. The monkeys were given about five quid. Some came back with little. The last one came back with a lot, so the receipts were examined. Apparently, he went for the slightly older food that was cheaper. Ricky is not having it and berates Karl.");
        DBHelper.save(articles01e02);

        Article articles01e03 = new Article("Monkey Sanctuary Hunter", ham, categoryFakeNews, locationZoo, dateS01E03,
                "Monkey Sanctuary where women workers were encouraged to bare their breasts to the gorillas", "This news story is about a monkey sanctuary where monkeys go if they don't like the zoo. One of the chimps wanted to mess about with the woman's breasts that worked there. She wasn't having it, but her boss told her to carry on despite the harassment. Rick denies any truth to the story, but Karl insists it's true and says he'll post the article. In the end the woman was sacked.");
        DBHelper.save(articles01e03);

        Article articles01e04 = new Article("Monkey chat show", jack, categoryPropaganda, locationWorld, dateS01E04,
                "Monkey hosts chat show in Moscow", " In Moscow, there is a TV channel that went through a load of redundancies. As a chat show was about to go live, the crew realised they had no one to present. For some reason, there was a chimp knocking about. They popped the chimp into a suit and he presented the show. Karl isn't sure how the chimp asked questions, but it went all right. Steve suggests Cher is on the show, and Karl carries on about how Cher loved the chimp and it was one of the best interviews she'd ever been part of. The chimp stayed on.");
        articles01e04.setCounter(17);
        DBHelper.save(articles01e04);

        Article articles01e05 = new Article("Monkey Lives With Zoo Keeper", ollieTheChimp, categoryFakeNews, locationZoo, dateS01E05,
                "Monkey starts acting like a human person, starts hitting on zoo keeper's wife, ends up living with zoo keeper's wife", "Oliver the Humanzee, the chimp who was a bit lonely in the zoo as there was no other monkeys and became mates with the zoo keeper. As time went on he started helping the zoo keeper with his work. After a while, the monkey moved in with the zoo keeper... and trouble ensues.");
        articles01e05.setCounter(87);
        DBHelper.save(articles01e05);

        Article articles01e06 = new Article("NYFD Monkey", enos, categoryLocalHero, locationJungle, dateS01E06,
                "Monkey from NYFD saves people from burning building", " involves a skyscraper fire in New York and a short little hero with long hairy arms. DJ ReachAround presents a dance mix version of I Could Eat a Knob at Night.");
        articles01e06.setCounter(5);
        DBHelper.save(articles01e06);

        Article articles01e07 = new Article("Monkey on building site", jenny, categoryLocalHero, locationJungle, dateS01E07,
                "Monkey builder goes from building to building just building", "While working on a building site, a man is surprised to see a little fella working on the top bit. He is curious why this bloke stays working high up and never comes down, after more investigation, the bloke makes a startling revelation...");
        articles01e07.setCounter(5);
        DBHelper.save(articles01e07);

        Article articles01e08 = new Article("Monkey Winter Olympics", alfredTheMonkey, categoryObituary, locationWorld, dateS01E08,
                "Monkey crashes bobsled during Winter Olympics...", "Monkey crashes bobsled during Winter Olympics because of photographers' cameras flashes, is taken by an ambulance, ends up in zoo with some sort of neck guard");
        articles01e08.setCounter(25);
        DBHelper.save(articles01e08);

        Article articles01e09 = new Article("Monkey Air", enos, categoryLocalHero, locationAir, dateS01E09, "Monkey Pilot, gets caught by a passenger who rushes into cockpit wanting a bag of nuts", "Ricky announces Monkey News. Karl sets the scene: an airline has a lack of pilots due to a strike. A manager of the airline is able to fly a plane with a help from his son and a certain co-pilot. Some how they managed to get someone past the picket lines to help fly the plane. Since it's the only plane flying, it's very successful. In addition, the flight is brilliant and everyone is loving it! It's a great experience. Things are going great until one day a woman on the plane wanted a bag of nuts. For some reason, the airline stopped giving out the nuts. Despite not being able to complain about the flight, she wants some nuts. Earlier she saw a bag of nuts being delivered to the cockpit. She storms the cockpit and there's a monkey sat there with headphones");
        articles01e09.setCounter(52);
        DBHelper.save(articles01e09);

        Article articles01e10 = new Article("The Gangster and the Jockey", ollieTheChimp, categoryCrime, locationLocal, dateS01E10, "Monkey Jockey, wins a race, grabs a fruit from a lady's hat and gets caught.", "The jingle climatically rumbles in; it's time for Monkey News. This story is about a 50s gangster who liked to gamble who owned a horse. And the human jockey turned up and it was fine. All he needed was a jockey, so he asked his mate to get one for him. Which isn't a problem because there's always plenty of human jockeys to go around. There is a problem getting jockey since they didn't want to get involved with a gangster. The gangster demands his lackeys find a jockey or else. The day of the race, they found a jockey. The only experience he's had in the circus though. The race begins, and the jockey is grinning. The horse is going so fast that it's all a smiling blur. He wins. The gangster collects the winnings. The jockey grabs fruit off a woman's hat, despite it being fake. Turns out, little monkey fella. This is the origin of the phrase Put a monkey on it, monkey being Cockney slang for 500 quid.");
        articles01e10.setCounter(44);
        DBHelper.save(articles01e10);

        Article articles01e11 = new Article("The Most Ridiculous Monkey News", ham, categoryScience, locationLocal, dateS01E011, "Monkey eye surgeon - Man's eyes fixed by a chimp doctor", "Ricky announces Monkey News. Karl begins to tell the story of a man with bad eyes who can't afford a doctor. He sees an advert for Cheap Doctors so he calls them up and makes an appointment. When he arrives, he doesn't see the doctor or anything, but the nurse just injects him and knocks him out right away. Ricky stops the news, incorrectly making a side note that chimps do not have opposable thumbs, when in fact, they do. The doctor comes in and it isn't saying anything to the patient and the surgery begins. After the surgery, the patient wakes up, his vision restored. The patient wants to see the doctor to thank him, but the nurse says it's not necessary. They argue about it so loudly that the doctor comes out to see what is going on. Turns out it's a little monkey. The patient is confused. Why is a monkey there? The nurse says, the advert read Chimp Doctors, so he shouldn't be surprised. The monkey carried on working for a few years.");
        articles01e11.setCounter(20);
        DBHelper.save(articles01e11);

        Article articles01e12 = new Article("Press the Right Button and Do Summat!", jack, categoryEntertainment, locationOuterSpace, dateS01E012, "Monkey in space update, apparently there's a museum for chimponauts.", "Monkey News and Steve is getting annoyed with the particularly robust jingle. Karl wants to retire the feature; all the news has been done. There's an update on the first Monkey News from Episode 1. The monkey could never get that high again, even when he tried to get a band together. This monkey was Ham and another was Enos. When Enos went up, the buttons were reversed, but fortunately he knew it wasn't right. He became part of the chimponauts who lived in a retirement home with a museum where they could reminisce about their adventures. Karl has some inspiring words to close Monkey News.");
        articles01e12.setCounter(80);
        DBHelper.save(articles01e12);

        Article articles03e06 = new Article("Bonus Monkey News", journalistMonkey86, categoryFoodDrink, locationWorld, dateS03E06, "Monkey brings great ape fruit juice to a town in the middle of nowhere, a long time ago.", "In a town somewhere awhile ago, a barrel used to appear in a village that contained a fruit drink. This was back when people only drank water. They only ate fruit back then, they didn’t drink it. Visitors to the village loved it, but they couldn’t sell it because they didn’t know where it came from. Word got out and a businessman from Chicago came in and wanted to find out where they got it. At night he saw a little fella and he followed him back to where they made it. Presumably the fruit drink was made by monkeys. Great ape fruit juice. (And that's why they stopped doing it...)");
        articles03e06.setCounter(14);
        DBHelper.save(articles03e06);
    }

        //-----------------------------------------------------------------------
        public static String storyAge(GregorianCalendar article) {
        GregorianCalendar currentTime = new GregorianCalendar();
            System.out.println(article.get(Calendar.WEEK_OF_MONTH));
            int articleYearsOld = (currentTime.get(Calendar.YEAR) - article.get(Calendar.YEAR));
            int articleMonthsOld = (currentTime.get(Calendar.MONTH) - article.get(Calendar.MONTH));
            int articleWeeksOld = (currentTime.get(Calendar.WEEK_OF_YEAR) - article.get(Calendar.WEEK_OF_YEAR));
            int articleDaysOld = (currentTime.get(Calendar.DAY_OF_WEEK) - article.get(Calendar.DAY_OF_WEEK));
            String result = articleYearsOld  + " years " + articleMonthsOld + " months " + articleDaysOld + " days old";
            return result;
        }

        public static String storyAgeSimple(GregorianCalendar article) {
            GregorianCalendar currentTime = new GregorianCalendar();
            String storyAgeSimple = new String();
            int articleYearsOld = (currentTime.get(Calendar.YEAR) - article.get(Calendar.YEAR));
            int articleWeeksOld = (currentTime.get(Calendar.WEEK_OF_YEAR) - article.get(Calendar.WEEK_OF_YEAR));
            int articleDaysOld = currentTime.get(Calendar.DAY_OF_WEEK) - article.get(Calendar.DAY_OF_WEEK);
            int articleHoursOld = currentTime.get(Calendar.HOUR_OF_DAY) - article.get(Calendar.HOUR_OF_DAY);
            int articleMinutesOld = currentTime.get(Calendar.MINUTE) - article.get(Calendar.MINUTE);
            int articleMonthsOld = currentTime.get(Calendar.MONTH) - article.get(Calendar.MONTH);

            if (articleYearsOld > 0) {
                storyAgeSimple += (articleYearsOld + " years ago");}
            else
            if (articleMonthsOld > 0 && articleMonthsOld < 12 ) {
                storyAgeSimple +=(articleMonthsOld + " month(s) ago");}
            else
            if (articleWeeksOld > 0 && articleWeeksOld < 53 ) {
                storyAgeSimple +=(articleWeeksOld + " week(s) ago");}
            else
            if (articleDaysOld > 0 && articleDaysOld <32 ){
                storyAgeSimple +=(articleDaysOld + " day(s) ago");}
            else
            if (articleHoursOld > 0 && articleHoursOld < 24 ){
                storyAgeSimple += (articleHoursOld + " hour(s) ago.");}
            else
            if (articleMinutesOld > 0 && articleMinutesOld < 60){
                storyAgeSimple += (articleMinutesOld + " minute(s) ago.");}
            else
            if (articleMinutesOld != 0 ){
                storyAgeSimple += (" Just Added!");
            }
            else
                storyAgeSimple += ("\uD83C\uDF4C \uD83C\uDF4C \uD83C\uDF4C  FRESH BANANA  \uD83C\uDF4C \uD83C\uDF4C \uD83C\uDF4C");

//            System.out.println(storyAgeSimple);
            return storyAgeSimple;
        }

}


