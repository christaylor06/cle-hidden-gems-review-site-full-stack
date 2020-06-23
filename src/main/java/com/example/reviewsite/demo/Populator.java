package com.example.reviewsite.demo;

import com.example.reviewsite.demo.models.Category;
import com.example.reviewsite.demo.models.Review;
import com.example.reviewsite.demo.repositories.CategoryRepository;
import com.example.reviewsite.demo.repositories.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Populator implements CommandLineRunner {

    @Resource
    private ReviewRepository reviewRepo;
    @Resource
    private CategoryRepository categoryRepo;

    @Override
    public void run(String... args) throws Exception {
        Category active = new Category("Active");
        Category architecture = new Category("Architecture");
        Category familyFriendly = new Category("Family-friendly");
        Category greenThumb = new Category("Green Thumb");
        Category haunted = new Category("Haunted");
        Category hiddenGem = new Category("Hidden Gem");
        Category history = new Category("History");
        Category horror = new Category("Horror");
        Category natureLover = new Category("Nature Lover");
        Category nightLife = new Category("Nightlife");
        Category oneTankTrip = new Category("One-tank Trip");
        Category romantic = new Category("Romantic");
        Category thrillSeekers = new Category("Thrill-seekers");
        categoryRepo.save(active);
        categoryRepo.save(architecture);
        categoryRepo.save(familyFriendly);
        categoryRepo.save(greenThumb);
        categoryRepo.save(haunted);
        categoryRepo.save(hiddenGem);
        categoryRepo.save(history);
        categoryRepo.save(horror);
        categoryRepo.save(natureLover);
        categoryRepo.save(nightLife);
        categoryRepo.save(oneTankTrip);
        categoryRepo.save(romantic);
        categoryRepo.save(thrillSeekers);

        Review aSecretSpeakeasy = new Review(1L,"A Secret Speakeasy","./images/Quintanas.jpg", " Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too", nightLife,hiddenGem);
        Review annualCulturalFestivals = new Review(2L,"Annual Cultural Festivals","./images/cultural_festivals.jpg","Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too.", hiddenGem, familyFriendly);
        Review bASweetieCandyCompany = new Review(3L,"B.A. Sweetie Candy Company","./images/Sweeties-Candy-Store-Edited.jpg.","Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too", hiddenGem, familyFriendly);
        Review clevelandArcade = new Review(4L,"Cleveland Arcade","./images/cleveland_arcade.jpg", "Built in 1890 at a cost of $875,000, The Arcade Cleveland opened to much fanfare as the very first indoor shopping center in America. Designers John M. Eisenmann and George H. Smith designed it as an urban mercantile center and modeled it after the Galleria Vittorio Emanuele II in Milan, Italy. The project was financed by Cleveland’s most esteemed businessmen of the late 19th century, including John D. Rockefeller, Steven V. Harkness, Louis Severance, Charles Brush and Marcus Hanna.", architecture, familyFriendly, hiddenGem);
        Review clevelandMetroparksMountainBikeCourses = new Review(5L,"Cleveland Metroparks Mountain Bike Courses","./images/bedford_mountain_bike_trail.jpg","If you're jonesing for a fitness jolt that's as unique as this place we call home, dust off your bike helmet. We know you're not interested in a run-of-the-mill experience, so pack your gear and head to one of these loved-by-locals trails in the Cleveland region. Whether you're a beginner looking for a short half-mile loop or an advanced thrill-seeker looking for a rush, the Cleveland Metroparks offers four distinct mountain bike trails with 22 miles of rugged paths for bikers and hikers alike",active, familyFriendly, hiddenGem, thrillSeekers);
        Review franklinCastle = new Review(6L,"Franklin Castle","./images/franklin_castle.jpg","Franklin Castle is reported to be the most haunted house in Ohio. The story of the structure dates to the 1880’s and Hannes Tiedemann, a German immigrant, and his wife, Louise, who built the home on Franklin Boulevard in Ohio City. On January 15, 1891, Tiedemann's fifteen-year-old daughter Emma succumbed to diabetes.",familyFriendly, haunted, horror, hiddenGem);
        Review lakeviewCemetery = new Review(7L,"Lakeview Cemetery","./images/lakeview cemetary.jpg", "With 285 breathtaking acres, Lake View Cemetery is the perfect place to spend the afternoon—or the afterlife. You can visit Wade Chapel where its elaborate interior decor was designed and manufactured by Tiffany & Co. (Louis Comfort Tiffany personally sought out the commission) ; the James A. Garfield Memorial, where the 20th U.S. President is interred; the Haserot Angel, a famous sculpture that appears to “cry” black tears; and the graves of people like Alan Freed, Eliot Ness, and even John D. Rockefeller (yes, THAT John D. Rockefeller).", familyFriendly, haunted, hiddenGem, history);
        Review rockefellerParkGreenhouse = new Review(8L,"Rockefeller Park Greenhouse","./images/Rockefeller Greenhouse.jpg","The Rockefeller Park Greenhouse had its origins more than a century ago. The first plans for the City Garden, as it was originally called, were presented in 1902. Three years later the first units were completed on a portion of the 200 plus acres donated to the City by John D. Rockefeller. Initially, the Greenhouse was used only to grow plants for landscaping City Parks and Gardens.  While City beautification is still a  major goal, the Greenhouse and grounds have evolved into a botanical garden with specialty plant collections, seasonal floral displays, outdoor classrooms, and theme gardens.   Just off MLK Dr, exit of I-90 at the top of E. 88th Street. Open daily, including weekends and holidays, from 10:00 am to 4:00 pm. Parking and admission are free.",greenThumb, familyFriendly, hiddenGem, natureLover);
        Review squiresCastle = new Review(9L,"Squire’s Castle","./images/Squire's_Castle.jpg","Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too", active, familyFriendly, haunted, hiddenGem, history, natureLover);
        Review terminalTowerObservationDeck = new Review(10L,"Terminal Tower Observation Deck","./images/Terminal_Tower_Observation_Deck_(14920583799).jpg", "Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too", architecture, familyFriendly, hiddenGem);
        Review theWilds = new Review(11L,"Bonus: One-tank Trips: The Wilds","./images/the_wilds.jpg","Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too", familyFriendly, hiddenGem, oneTankTrip);
        Review belamereSuites = new Review(12L,"Bonus: One-tank Trips: The Belamere Suites Hotel","./images/belamere_suites.jpg","Craft cocktails, a secret back door buzzer, and a bookcase passage? WE love a good speakeasy that captures the mystery and romance from the era of Prohibition without the grit… Actually we like a little of the grit too", hiddenGem, oneTankTrip, romantic);
        reviewRepo.save(aSecretSpeakeasy);
        reviewRepo.save(annualCulturalFestivals);
        reviewRepo.save(bASweetieCandyCompany);
        reviewRepo.save(clevelandArcade);
        reviewRepo.save(clevelandMetroparksMountainBikeCourses);
        reviewRepo.save(franklinCastle);
        reviewRepo.save(lakeviewCemetery);
        reviewRepo.save(rockefellerParkGreenhouse);
        reviewRepo.save(squiresCastle);
        reviewRepo.save(terminalTowerObservationDeck);
        reviewRepo.save(theWilds);
        reviewRepo.save(belamereSuites);


    }
}
