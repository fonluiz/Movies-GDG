package br.edu.ufcg.harrypottermovies;

import java.util.ArrayList;

/**
 * Classe que cria os objetos para cada filme e os coloca em uma lista. A classe também fornece
 * métodos estáticos para acessar a lista dos filmes. Os dados dos filmes foram retirados do site
 * official da WarnerBros (http://www.warnerbros.com) e as avaliaçoes foram retiradas do site
 * http://www.imdb.com/.
 */
public class MoviesRepository {

    private static final int NUMBER_OF_MOVIES = 8;
    private static ArrayList<Movie> moviesList;

    public static void createMovies() {
        moviesList = new ArrayList<Movie>();

        // Harry Potter and the sorcerer's stone
        moviesList.add(new Movie("Harry Potter and the Sorcerer's Stone", R.drawable.harry_potter_sorcerers_stone_keyart,
                2001, "2h 32 min", 7.5, "In this enchanting, three-time Oscar nominated film adaptation of J.K. Rowling's delightful " +
                "bestseller (and the first entry in the most successful movie series in box-office history), Harry Potter" +
                " learns on his 11th birthday that he is the orphaned first son of two powerful wizards and possesses magical" +
                " powers of his own.\n" + "\n" + "At Hogwarts School of Witchcraft and Wizardry, Harry embarks on the adventure" +
                " of a lifetime. He learns the high-flying sport Quidditch and plays a thrilling game with living chess pieces" +
                " on his way to face a Dark Wizard bent on destroying him.\n" + "\n" + "For the most extraordinary adventure," +
                " see you on platform nine and three quarters!", new String[]{"https://www.youtube.com/watch?v=PbdM1db3JbY",
                "https://www.youtube.com/watch?v=eKSB0gXl9dw"}));
        // Harry Potter and the Chamber of Secrets
        moviesList.add(new Movie("Harry Potter and the Chamber of Secrets", R.drawable.harry_potter_chamber_of_secrets_keyart,
                2002, "2h 41 min", 7.4, "The second installment in the Harry Potter series finds young wizard Harry Potter (Daniel Radcliffe)" +
                " and his friends Ron Weasley (Rupert Grint) and Hermione Granger (Emma Watson) facing new challenges during their" +
                " second year at Hogwarts School of Witchcraft and Wizardry as they try to uncover a dark force that is terrorizing" +
                " the school.", new String[]{"https://www.youtube.com/watch?v=1bq0qff4iF8", "https://www.youtube.com/watch?v=q_V45YQ-EaA"}));
        // Harry Potter and the Prisoner of Azkaban
        moviesList.add(new Movie("Harry Potter and the Prisoner of Azkaban", R.drawable.harry_potter_prisoner_of_azkaban_keyart,
                2004, "2h 21 min", 7.8, "In Harry Potter and the Prisoner of Azkaban, Harry, Ron and Hermione, now teenagers, return for" +
                " their third year at Hogwarts, where they are forced to face escaped prisoner, Sirius Black, who poses a great threat" +
                " to Harry.\n" + "\n" + "Harry and his friends spend their third year learning how to handle a half-horse half-eagle" +
                " Hippogriff, repel shape-shifting Boggarts and master the art of Divination. They also visit the wizarding village" +
                " of Hogsmeade and the Shrieking Shack, which is considered the most haunted building in Britain.\n" + "\n" + "In" +
                " addition to these new experiences, Harry must overcome the threats of the soul-sucking Dementors, outsmart a dangerous" +
                " werewolf and finally deal with the truth about Sirius Black and his relationship to Harry and his parents.\n" + "\n" +
                "With his best friends, Harry masters advanced magic, crosses the barriers of time and changes the course of more" +
                " than one life. Directed by Alfonso Cuaron and based on J.K. Rowling's third book, this wondrous spellbinder soars" +
                " with laughs, and the kind of breathless surprise only found in a Harry Potter adventure.\n",
                new String[]{"https://www.youtube.com/watch?v=lAxgztbYDbs", "https://www.youtube.com/watch?v=TY-L_z93oy8"}));
        // Harry Potter and the Goblet of Fire
        moviesList.add(new Movie("Harry Potter and the Goblet of Fire", R.drawable.harry_potter_goblet_of_fire_keyart,
                2005, "2h 37 min", 7.6, "When Harry Potter's name emerges from the Goblet of Fire, he becomes a competitor in" +
                " a grueling battle for glory among three wizarding schools—the Triwizard Tournament.\n" + "\n" + "But" +
                " since Harry never submitted his name for the Tournament, who did?\n" + "\n" + "Now Harry must confront" +
                " a deadly dragon, fierce water demons and an enchanted maze only to find himself in the cruel grasp of" +
                " He Who Must Not Be Named.\n" + "\n" + "In this fourth film adaptation of J.K. Rowling's Harry Potter" +
                " series, everything changes as Harry, Ron and Hermione leave childhood forever and take on challenges" +
                " greater than anything they could have imagined.", new String[]{"https://www.youtube.com/watch?v=PFWAOnvMd1Q",
                "https://www.youtube.com/watch?v=7lJ6Suyp1ok"}));
        // Harry Potter and the Order of the Phoenix
        moviesList.add(new Movie("Harry Potter and the Order of the Phoenix", R.drawable.harry_potter_order_of_the_phoenix_keyart,
                2007, "2h 18 min", 7.5, "Lord Voldemort has returned, but few want to believe it. In fact, the Ministry of Magic is doing" +
                " everything it can to keep the wizarding world from knowing the truth—including appointing Ministry official Dolores" +
                " Umbridge as the new Defense Against the Dark Arts teacher at Hogwarts.\n" + "\n" + "When Professor Umbridge refuses" +
                " to train her students in practical defensive magic, a select group of students decides to learn on their own. With" +
                " Harry Potter as their leader, these students (who call themselves \"Dumbledore's Army\") meet secretly in a hidden" +
                " room at Hogwarts to hone their wizarding skills in preparation for battle with the Dark Lord and his Death Eaters.\n" +
                "\n" + "New adventure—more dangerous , more thrilling than ever—is yours in this enthralling film version of the fifth" +
                " novel in J.K. Rowling's Harry Potter series. A terrifying showdown between good and evil awaits. Prepare for battle!",
                new String[]{"https://www.youtube.com/watch?v=y6ZW7KXaXYk", "https://www.youtube.com/watch?v=WIj9DYJ5EKk"}));
        // Harry Potter and tha Half-Blood Prince
        moviesList.add(new Movie("Harry Potter and the Half-Blood Prince", R.drawable.harry_potter_half_blood_prince_keyart,
                2009, "2h 33 min", 7.5, "Voldemort is tightening his grip on both the Muggle and wizarding worlds and Hogwarts is no" +
                " longer the safe haven it once was. Harry suspects that dangers may even lie within the castle, but Dumbledore" +
                " is more intent upon preparing him for the final battle that he knows is fast approaching.\n" + "\n" + "Together" +
                " they work to find the key to unlock Voldemort's defenses and, to this end, Dumbledore recruits his old friend" +
                " and colleague, the well-connected and unsuspecting bon vivant Professor Horace Slughorn, whom he believes holds" +
                " crucial information.\n" + "\n" + "Meanwhile, the students are under attack from a very different adversary" +
                " as teenage hormones rage across the ramparts. Harry finds himself more and more drawn to Ginny, but so is Dean" +
                " Thomas. And Lavender Brown has decided that Ron is the one for her, only she hadn't counted on Romilda Vane's" +
                " chocolates! And then there's Hermione, simmering with jealously but determined not to show her feelings.\n" + "\n" +
                "As romance blossoms, one student remains aloof. He is determined to make his mark, albeit a dark one. Love is" +
                " in the air, but tragedy lies ahead and Hogwarts may never be the same again.", new String[]{"https://www.youtube.com/watch?v=JYLdTuL9Wjw",
                "https://www.youtube.com/watch?v=jpCPvHJ6p90"}));

        moviesList.add(new Movie("Harry Potter and the Deathly Hallows - Part 1", R.drawable.harry_potter_deathly_hallows_pt1_keyart,
                2010, "2h 26 min", 7.7, "Nominated for two Oscars, Harry Potter and the Deathly Hallows - Part 1 begins as Harry, Ron and Hermione" +
                " set out on their perilous mission to track down and destroy the secret to Voldemort’s immortality and destruction—the" +
                " Horcruxes. \n" + "\n" + "On their own, without the guidance of their professors or the protection of Professor Dumbledore," +
                " the three friends must now rely on one another more than ever. But there are Dark Forces in their midst that threaten" +
                " to tear them apart.\n" + "\n" + "Meanwhile, the wizarding world has become a dangerous place for all enemies of the" +
                " Dark Lord. The long-feared war has begun and Voldemort’s Death Eaters seize control of the Ministry of Magic and even" +
                " Hogwarts, terrorizing and arresting anyone who might oppose them. But the one prize they still seek is the one most" +
                " valuable to Voldemort: Harry Potter. \n" + "\n" + "The Chosen One has become the hunted one as the Death Eaters search" +
                " for Harry with orders to bring him to Voldemort… alive. Harry’s only hope is to find the Horcruxes before Voldemort" +
                " finds him, but as he searches for clues, he uncovers an old and almost forgotten tale—the legend of the Deathly Hallows. \n",
                new String[]{"https://www.youtube.com/watch?v=MxqsmsA8y5k", "https://www.youtube.com/watch?v=-L-z8VNbrcU"}));

        moviesList.add(new Movie("Harry Potter and the Deathly Hallows - Part 2", R.drawable.harry_potter_deathly_hallows_pt2_keyart,
                2011, "2h 10 min", 8.1, "In Part 2 of the epic finale, the battle between the good and evil forces of the Wizarding World escalate" +
                " into an all-out war. The stakes have never been higher and no one is safe. But it is Harry Potter who may be called" +
                " upon to make the ultimate sacrifice as he draws closer to the climactic showdown with Lord Voldemort. It all ends here.",
                new String[]{"https://www.youtube.com/watch?v=mObK5XD8udk", "https://www.youtube.com/watch?v=5NYt1qirBWg"}));
    }

    public static ArrayList<Movie> getMoviesList() {
        return moviesList;
    }

    public static int[] getMoviesPosters() {
        int[] array = new int[NUMBER_OF_MOVIES];
        for (int i = 0; i < NUMBER_OF_MOVIES; i++) {
            array[i] = moviesList.get(i).getPoster();
        }
        return array;
    }

}
