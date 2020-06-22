package com.example.reviewsite.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review review = new Review(1L,"A Secret Speakeasy","./images/Quintanas.jpg","Categories: Hidden Gen, Nightlife", "Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too. But did you miss this one? Enter Quintana’s Barber & Dream Spa (you read that right) on Taylor Road in Cleveland Heights. Located inside of a converted 1920’s colonial house, where you’ll likely see someone inside getting an old-fashioned straight-razor shave or trim. The first floor is a fully functioning barbershop that’s reminiscent of not just a shave and haircut but rather a place where business deals are made, patrons chew the fat, and socialize alike. Walk through the swanky barbershop with vintage barber chairs to the upstairs to find the darkly lit secret bookcase passage that leads you to the hidden bar and speakeasy lounge  complete with artisanal crafted cocktails and hip atmosphere await. ");
        Review review2 = new Review(2L,"Annual Cultural Festivals","./images/cultural_festivals.jpg","Categories: Hidden Gem, Family Friendly","We’ve got nearly 50! - It’s about food and music and arts, but also communities, neighborhoods and tradition. From May through October, dozens of ethnic, cultural and street parties assault the senses with enough music, food and partying to make you feel as if you’d traveled your way around the world.");
        Review review3 = new Review(3L,"B.A. Sweetie Candy Company","./images/Sweeties-Candy-Store-Edited.jpg.","Categories: Family Friendly, Hidden Gem ","What's better than being a kid in a candy store? Being an adult in a candy store! No more begging for quarters from your parents - you can buy any and every candy you ever wanted. This is the biggest candy warehouse in the US (and therefore probably in the world). If buying jelly beans by the pound isn't enough sugar, there's even an on-site Soda Shoppe. They also have a whole collection of 'nostalgia candy', with even more Pez dispensers than you knew existed!");
        Review review4 = new Review(4L,"Cleveland Arcade","./images/cleveland_arcade.jpg","Categories: Architecture, Family Friendly, Hidden Gem", "Built in 1890 at a cost of $875,000, The Arcade Cleveland opened to much fanfare as the very first indoor shopping center in America. Designers John M. Eisenmann and George H. Smith designed it as an urban mercantile center and modeled it after the Galleria Vittorio Emanuele II in Milan, Italy. The project was financed by Cleveland’s most esteemed businessmen of the late 19th century, including John D. Rockefeller, Steven V. Harkness, Louis Severance, Charles Brush and Marcus Hanna.");
        Review review5 = new Review(5L,"Cleveland Metroparks Mountain Bike Courses","./images/bedford_mountain_bike_trail.jpg","Categories: Family Friendly, Hidden Gem, Thrill-seekers","If you're jonesing for a fitness jolt that's as unique as this place we call home, dust off your bike helmet. We know you're not interested in a run-of-the-mill experience, so pack your gear and head to one of these loved-by-locals trails in the Cleveland region. Whether you're a beginner looking for a short half-mile loop or an advanced thrill-seeker looking for a rush, the Cleveland Metroparks offers four distinct mountain bike trails with 22 miles of rugged paths for bikers and hikers alike");
        Review review6 = new Review(6L,"Franklin Castle","./images/franklin_castle.jpg","Categories: Family Friendly, Haunted, Horror, Hidden Gem, Nature Lover, Thrill-seekers","Franklin Castle is reported to be the most haunted house in Ohio. The story of the structure dates to the 1880’s and Hannes Tiedemann, a German immigrant, and his wife, Louise, who built the home on Franklin Boulevard in Ohio City. On January 15, 1891, Tiedemann's fifteen-year-old daughter Emma succumbed to diabetes. The house saw its second death not long afterwards when Tiedemann's elderly mother, Wiebeka, died. During the next three years the Tiedemanns would bury three more children, giving rise to speculation that there was more to the deaths than met the eye. To distract his wife, Louise, from these tragedies, Tiedemann began extensive construction on the home, adding a ballroom which runs the length of the house on the fourth floor of the manor. Also during this building, turrets and gargoyles were added to the edifice's facade, giving the house an even more pronounced \"castle\" appearance. It is rumored that hidden rooms and passageways were used for bootlegging during Prohibition. Though rumored, none of these rooms or passageways exist other than a small stairway used by servants from the kitchen to the front door. Today, the castle is the unlikely home of a unique and successful record business. While the current owners have closed the castle to the public, it remains a frequent spot for photo ops on walking ghost tours of Cleveland.");
        Review review7 = new Review(7L,"Lakeview Cemetery","./images/lakeview cemetary.jpg","Categories: Family Friendly, Haunted, Hidden Gem, History", "With 285 breathtaking acres, Lake View Cemetery is the perfect place to spend the afternoon—or the afterlife. You can visit Wade Chapel where its elaborate interior decor was designed and manufactured by Tiffany & Co. (Louis Comfort Tiffany personally sought out the commission) ; the James A. Garfield Memorial, where the 20th U.S. President is interred; the Haserot Angel, a famous sculpture that appears to “cry” black tears; and the graves of people like Alan Freed, Eliot Ness, and even John D. Rockefeller (yes, THAT John D. Rockefeller).");
        Review review8 = new Review(8L,"Rockefeller Park Greenhouse","./images/Rockefeller Greenhouse.jpg","Categories: Family Friendly, Green Thumb, Hidden Gem, Nature Lover","The Rockefeller Park Greenhouse had its origins more than a century ago. The first plans for the City Garden, as it was originally called, were presented in 1902. Three years later the first units were completed on a portion of the 200 plus acres donated to the City by John D. Rockefeller. Initially, the Greenhouse was used only to grow plants for landscaping City Parks and Gardens.  While City beautification is still a  major goal, the Greenhouse and grounds have evolved into a botanical garden with specialty plant collections, seasonal floral displays, outdoor classrooms, and theme gardens.   Just off MLK Dr, exit of I-90 at the top of E. 88th Street. Open daily, including weekends and holidays, from 10:00 am to 4:00 pm. Parking and admission are free.");
        Review review9 = new Review(9L,"Squire’s Castle","./images/Squire's_Castle.jpg","Categories:  Active, Family Friendly, Haunted, Hidden Gem, History, Nature Lover","This beautiful old gatehouse from the 1890s is modeled after German and English baronial castles and is a unique feature of North Chagrin that is a popular destination for people of all ages. In the late-19th century, Feargus B. Squire purchased 525 acres in the scenic Chagrin Valley. The English-born Squire started his career as an office boy at an oil company and eventually became the vice president of John D. Rockefeller’s Standard Oil. Squire commissioned a New York-based architect and intended to build two massive, ornate European-style mansions on the Willoughby Hills site. The first (and only) building to be built was the gatehouse, which had three floors, a basement, and even a room for Squire’s exotic hunting trophies. The urban myth version of why the rest of the castle was constructed involves the tracing death of Squire’s wife, Rebecca in the house. Today all that remains of Squire’s brief stay in the would-be castle is the exterior shell—that, and the occasional ghost stories of Mrs. Squire. People have reported seeing a red lantern light and a female figure near the property.");
        Review review10 = new Review(10L,"Terminal Tower Observation Deck","./images/Terminal_Tower_Observation_Deck_(14920583799).jpg","Categories: Architecture, Family Friendly, Hidden Gem", "The Terminal Tower rises up 771 feet above Public Square in downtown Cleveland, and is one of the most iconic and recognizable buildings in the city’s skyline. Built during the “skyscraper boom” of the 1920s and ’30s, Terminal Tower opened as an office building in 1928 atop Cleveland’s new rail station, Cleveland Union Terminal (so now you know where the name comes from). The building was officially dedicated in 1930, which was also when it was first lit up with spotlights and topped with a strobe light.  The 52-story building was the second-tallest building in the entire world when it was built, and remained the tallest building outside of New York in the US until the mid-1960s. About a decade ago, the Terminal Tower Observation Deck was restored to look as it had back around 1930. And today, the 42nd floor is once again open to visitors. The Terminal Tower Observation Deck is open on Saturdays and Sundays from mid-April through mid-December.");
        Review review11 = new Review(11L,"Bonus: One-tank Trips: The Wilds","./images/the_wilds.jpg","Categories: Family Friendly, Hidden Gem, One-tank Trip","Nomad Ridge at The Wilds in Cumberland is arguably one of Ohio’s best kept secrets. It’s a hidden gem tucked away from the hustle and bustle of the city and miles away from the small town life. This glampground features several private yurts that provide all the comforts of home just steps away from open pastures, breathing views and exotic animals. ");
        Review review12 = new Review(12L,"Bonus: One-tank Trips: The Belamere Suites Hotel","./images/belamere_suites.jpg","Categories: Hidden Gem, One-tank Trip, Romantic","The Belamere Suites Hotel in Perrysburg, Ohio snagged the top spot for TripAdvisor's best hotel in the U.S. and sixth in the world for romance. Belamere Suites Hotel has luxuriously appointed rooms, many with their own private in suite swimming pool heated to 94 degrees.");


        reviewList.put(review.getId(), review);
        reviewList.put(review2.getId(), review2);
        reviewList.put(review3.getId(), review3);
        reviewList.put(review4.getId(), review4);
        reviewList.put(review5.getId(), review5);
        reviewList.put(review6.getId(), review6);
        reviewList.put(review7.getId(), review7);
        reviewList.put(review8.getId(), review8);
        reviewList.put(review9.getId(), review9);
        reviewList.put(review10.getId(), review10);
        reviewList.put(review11.getId(), review11);
        reviewList.put(review12.getId(), review12);


    }

    public Collection<Review> findAll() {

        return reviewList.values();
    }

    public Review findOne(long id) {

        return reviewList.get(id);
    }


}
