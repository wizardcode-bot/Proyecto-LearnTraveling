//In this Class will be joined the students and teacher information in a single file (course).
package LearnTraveling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Cursos extends Estudiante{
    int conta = 1;
    
    public void Añadir(){
        FileWriter flwriter = null;
		try {//además de la ruta del archivo recibe un parámetro de tipo boolean, que le indican que se va añadir más registros 
			flwriter = new FileWriter("Docente.txt", true);
			BufferedWriter bfwriter = new BufferedWriter(flwriter);
			
				//escribe los datos en el archivo
			bfwriter.write(   "\n\n   Enrolled Student."
              + "\n\nName: "+name+"\nCountry: "+country+"\nLanguage/s: "+language);
			bfwriter.close();
                        JOptionPane.showMessageDialog(null, "Congratulations! You've been succesfully enrolled in this course!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (flwriter != null) {
				try {
					flwriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
    }
    
   public void languages(){
        int cont=0,lang = 0;
        
       do{
        cont = Integer.parseInt(JOptionPane.showInputDialog("    Choose a Continent"
               + "\n\n1. EUROPE\n2. ASIA\n3. NORTH AMERICA\n4. SOUTH AMERICA\n5. AFRICA\n0. Exit"));
        
        switch(cont){
            case 1://CONTINENT
                lang = Integer.parseInt(JOptionPane.showInputDialog("    Choose a Language"
               + "\n\n1. RUSSIAN\n2. GERMAN\n3. FRENCH\n4. ENGLISH\n5. SPANISH\n0. Exit"));
                
                switch(lang){
                    case 1://LANGUAGE
                        JOptionPane.showMessageDialog(null, "Russian is the most spoken language "
                                + "in Europe with 120 million native speakers on the continent! "
                                + "\nThis is particularly interesting because while most languages "
                                + "in Europe use the Latin alphabet, \nRussian uses the Cyrillic alphabet instead."
                                + " This can be a tricky challenge for those wanting to pick up Russian as a "
                                + "\nforeign language, but it doesn’t hinder the millions of individuals that claim it"
                                + " as their mother tongue. \n\nCountries where Russian is spoken:"
                                + "\n--> Russia, Belarus, Kazakhstan, Ukraine, Azerbaijan and a few more.");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "The language of philosophers and thinkers, "
                                + "German comes in second \nfor the largest native-speaking population in Europe."
                                +"\n\nCountries where German is spoken:"
                                + "\nIt’s the sole official language of Germany, Austria and Liechtenstein, "
                                + "\nand it’s a co-official language in Switzerland, Belgium and Luxembourg. "
                                + "\nWith all of those countries combined, approximately 95 million people in Europe speak "
                                + "\nGerman as their first language. And did you know that German is the mostly "
                                + "\nwidely-understood language after English? This is because it’s popular as a second "
                                + "\n(or third, or fourth) language in Denmark, the Netherlands, Slovenia, Sweden, Poland, "
                                + "\nFinland, Hungary, and many other European countries. Why not add it to your list for "
                                + "\nyour trip to Germany?");
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "After Russian and German, the next most spoken language "
                                +"\nin Europe is French, with about 80 million native speakers. "
                                +"\n\nCountries where French is spoken:"
                                +"\nIt is the official language of France (of course), as well as a co-official language "
                                +"\nof Belgium, Switzerland and Luxembourg. If you consider the percentage "
                                +"\nof the population that learned French as a second language, then over 30% of European "
                                +"\ninhabitants know the language, making it a great choice for those that want to travel "
                                +"\naround the continent. That said, French’s global reach is even more impressive than its "
                                +"\nusefulness in Europe, as almost 30 countries claim French as an official language or an "
                                +"\nadministrative language!");
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "English, the global lingua franca has 400 million native speakers "
                                    + "worldwide, \nwith around 70 million living of those in Europe. \n\nCountries where English is spoken:"
                                + "\nIt’s the de facto (but not “official”) language of the United Kingdom "
                                + "and the Republic of Ireland, \nbut the large number of English-speaking expats residing in Europe "
                                + "also adds to this number. \nAs for second language speakers, about a third of older Europeans "
                                + "can speak English, \nwhile nearly half of 15- to 35-year-olds have a mastery of the language. "
                                + "\nThat said, some scholars theorize that the political realities of Brexit may weaken the dominance "
                                + "\nof English in Europe in the future. All the more reason to add another language under your belt now.");
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "For years now, Spain has enjoyed a covetable position as one of Europe’s best "
                                + "\ntravel destinations — especially for other Europeans looking for a warm and relaxing summer vacation. "
                                + "\nThat, along with the fact that 45 million Europeans claim Spanish as their mother tongue, is reason enough "
                                + "\nto start learning this language. (By the way, did you know that Spanish is one of the easiest languages for "
                                + "\nEnglish speakers to learn?). \n\nCountries where Spanish is spoken:"
                                + "\nSpanish’s prestige grows even more when leaving Europe: 20 countries have Spanish "
                                + "\ndeclared as an official language and over 480 million individuals are Spanish native speakers throughout the "
                                + "\nglobe, making it the second most widely-spoken language in the world.");
                        break;
                        
                    default: 
                        JOptionPane.showMessageDialog(null, "Invalid Option, choose a valid number", "Error!", JOptionPane.ERROR_MESSAGE);
                        
                }
                break;
                
            case 2://CONTINENT
                lang = Integer.parseInt(JOptionPane.showInputDialog("    Choose a Language"
               + "\n\n1. MANDARIN\n2. ARABIC\n3. CHINESE\n4. JAPANESE\n5. KOREAN\n0. Exit"));
                
                switch(lang){
                    case 1://LANGUAGE
                        JOptionPane.showMessageDialog(null, "Mandarin Chinese is spoken by more than 1 billion people, "
                                + "\nmaking it the most widely spoken language in the world. While it may be obvious "
                                + "\nthat Mandarin Chinese is heavily spoken in Asian countries, it might surprise you "
                                + "\nhow many Chinese communities exist around the world. In the United States to "
                                + "\nSouth Africa and Nicaragua, Mandarin Chinese can be heard on the streets."
                                + "\n\nCountries where Mandarin is spoken:"
                                + "\nMandarin is the official language of Mainland China and Taiwan. "
                                + "\nIt is also one of the official languages of Singapore and the United Nations."
                                + "\nAnd Mandarin is also spoken in many Chinese communities throughout the world.");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "As many as 420 million people around the world speak Arabic,"
                                + "making it the fifth most spoken language. \nThe word “Arab” means “nomad”, which makes sense"
                                + "considering Arabic originated from nomadic tribes \nin the desert regions of the Arabian Peninsula."
                                + "\nArabic language evolved from Nabataean Aramaic script and has been used since the 4th century CE."
                                + "\nIt is written from right to left, in a cursive style, and includes 28 letters similar to the English "
                                + "\nalphabet. Arabic belongs to the “Semitic” group of languages and is closely related to Hebrew and Aramaic."
                                + "\n\nCountries where Arabic is spoken:"
                                + "\n--> Egypt, Iraq, Jordan, Lebanon, Libya, Palesine, Qatar, etc.");
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "The spoken varieties of Chinese are usually considered by native speakers "
                                + "\nto be variants of a single language. Due to their lack of mutual intelligibility, however, they are "
                                + "\nclassified as separate languages in a family by some linguists, who note that the varieties are as "
                                + "\ndivergent as the Romance languages. Investigation of the historical relationships among the varieties "
                                + "\nof Chinese is just starting. Currently, most classifications posit 7 to 13 main regional groups based "
                                + "\non phonetic developments from Middle Chinese, of which the most spoken by far is Mandarin"
                                + "\n\nCountries where Chinese is spoken:"
                                + "\n--> China, Taiwan, Singapore, Macau, Hong kong.");
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "The Japanese language is spoken by the approximately 120 million inhabitants"
                                + "\nof Japan, and by the Japanese living in Hawaii and on the North and South American mainlands."
                                + "\nIt is also spoken as a second language by the Chinese and the Korean people who lived under Japanese"
                                + "\noccupation earlier this century. Three categories of words exist in Japanese. "
                                + "\nThe native Japanese words constitute the largest category, followed by words originally borrowed from China "
                                + "\nin earlier history, and the smallest but a rapidly growing category of words borrowed in modern times from "
                                + "\nWestern languages such as English. This third category also contains a small number of words that have come "
                                + "\nfrom other Asian languages. \n\nCountries where Japanese is spoken:"
                                + "\n--> Japan, Brazil, Taiwan, France, United States.");
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Korean has about 360,000,000 million native speakers worldwide."
                                + "\nThere are 76 million native-Korean speakers worldwide, with most living on the Korean peninsula. "
                                + "\nThere are also major Korean-speaking communities in the bordering regions of China, "
                                + "\non the Japanese islands, and even within the former Soviet Union."
                                + "\nOn the peninsula itself, most dialects vary based on the mountainous geography and its valleys. "
                                + "\nThe primary dialect used nowadays is that of Seoul, with the provincial dialects typically adding "
                                + "\nor subtracting vowel sounds. With mass communication and education, the regional variations however "
                                + "\nare assimilating with Standard Korean. \n\nCountries where Korean is spoken:"
                                + "\n--> South Korea, North Korea");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, choose a valid number", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case 3://CONTINENT
                lang = Integer.parseInt(JOptionPane.showInputDialog("    Choose a Language"
               + "\n\n1. ENGLISH\n2. SPANISH\n3. FRENCH\n4. ITALIAN\n5. VIETNAMESE\n0. Exit"));
                
                switch(lang){
                    case 1://LANGUAGE
                        JOptionPane.showMessageDialog(null, "English, the global lingua franca has 400 million native speakers "
                                    + "worldwide, \nwith around 70 million living of those in Europe. \n\nCountries where English is spoken:"
                                + "\nIt’s the de facto (but not “official”) language of the United Kingdom "
                                + "and the Republic of Ireland, \nbut the large number of English-speaking expats residing in Europe "
                                + "also adds to this number. \nAs for second language speakers, about a third of older Europeans "
                                + "can speak English, \nwhile nearly half of 15- to 35-year-olds have a mastery of the language. "
                                + "\nThat said, some scholars theorize that the political realities of Brexit may weaken the dominance "
                                + "\nof English in Europe in the future. All the more reason to add another language under your belt now.");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "For years now, Spain has enjoyed a covetable position as one of Europe’s best "
                                + "\ntravel destinations — especially for other Europeans looking for a warm and relaxing summer vacation. "
                                + "\nThat, along with the fact that 45 million Europeans claim Spanish as their mother tongue, is reason enough "
                                + "\nto start learning this language. (By the way, did you know that Spanish is one of the easiest languages for "
                                + "\nEnglish speakers to learn?). \n\nCountries where Spanish is spoken:"
                                + "\nSpanish’s prestige grows even more when leaving Europe: 20 countries have Spanish "
                                + "\ndeclared as an official language and over 480 million individuals are Spanish native speakers throughout the "
                                + "\nglobe, making it the second most widely-spoken language in the world.");
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "After Russian and German, the next most spoken language "
                                +"\nin Europe is French, with about 80 million native speakers. "
                                +"\n\nCountries where French is spoken:"
                                +"\nIt is the official language of France (of course), as well as a co-official language "
                                +"\nof Belgium, Switzerland and Luxembourg. If you consider the percentage "
                                +"\nof the population that learned French as a second language, then over 30% of European "
                                +"\ninhabitants know the language, making it a great choice for those that want to travel "
                                +"\naround the continent. That said, French’s global reach is even more impressive than its "
                                +"\nusefulness in Europe, as almost 30 countries claim French as an official language or an "
                                +"\nadministrative language!");
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "Italian or lingua italiana  is a Romance language of the Indo-European "
                                + "\nlanguage family. Italian is, by most measures and together with Sardinian, the closest language "
                                + "\nto Latin, from which it descends via Vulgar Latin. Italian was adopted by the state after the "
                                + "\nUnification of Italy, having previously been a literary language based on Tuscan as spoken mostly "
                                + "\nby the upper class of Florentine society. Its development was also influenced by other Italian "
                                + "\nlanguages and, to some minor extent, by the Germanic languages of the post-Roman invaders. "
                                + "\nThe incorporation into Italian of learned words from its own ancestor language, Latin, is another "
                                + "\nform of lexical borrowing through the influence of written language, scientific terminology and the "
                                + "\nliturgical language of the Church. \n\nCountries where Italian is spoken:"
                                + "\n--> Italian is the official language of Italy, San Marino, Switzerland and Vatican City. "
                                + "\nIt’s also the official language of some parts of Croatia and Slovenia. "
                                + "\nThere is a relatively sizeable number of Italian speakers in Albania, Argentina, Australia, Belgium, "
                                + "\nBosnia and Herzegovina, Brazil, Canada etc..");
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "Vietnamese is spoken mainly along the coastal plains, river deltas, "
                                + "\nand adjacent highlands of the eastern portion of the Indo-Chinese Peninsula. "
                                + "\nThe 59 million people who speak Vietnamese (Grimes 1992) live mainly in Vietnam and the adjacent "
                                + "\ncountries of Southeast Asia. Vietnamese is the official language of Vietnam. As a result of economic "
                                + "\nand cultural development, particularly in the north, Vietnamese is also widely used as a second language "
                                + "\nby many of the mountain-dwelling ethnic minorities and in neighboring countries like Laos, Cambodia, "
                                + "\nand Thailand, where significant Vietnamese populations exist. \n\nCountries where Vietnamese is spoken:"
                                + "\n--> A significant number of Vietnamese speakers live overseas, notably in the United States (600,000), "
                                + "\nFrance (10,000), and, to a lesser extent, in Canada, Australia, Senegal, and Cote");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, choose a valid number", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                break;
                
            case 4://CONTINENT
                lang = Integer.parseInt(JOptionPane.showInputDialog("    Choose a Language"
               + "\n\n1. PORTUGUESE\n2. UKRAINIAN\n3. DUTCH\n4. SPANISH\n5. ENLGISH\n0. Exit"));
                
                switch(lang){
                    case 1://LANGUAGE
                        JOptionPane.showMessageDialog(null, "In the world of languages, Portuguese is an up-and-comer. No longer stuck in the "
                                + "\nshadow of Spanish, it now has too many speakers and too much economic muscle for global businesses to ignore. "
                                + "\nPortuguese is the 6th most spoken language in the world. Portuguese has around 215 million native speakers. "
                                + "\nIt is the most spoken language in South America and the 2nd most spoken language in Latin America. "
                                + "\nThe Portuguese Empire was Europe’s first colonial empire. As a result, Portuguese is an official language "
                                + "\nin 9 countries in Europe, Asia, Africa and South America. Brazilian Portuguese is different from European Portuguese."
                                + "\n\nCountries where Portuguese is spoken:"
                                + "\n--> Brazil is home to the vast majority of those speakers (over 205 million) and is the only country in South America "
                                + "\nwhere Portuguese is the official language. There are also contingents of Portuguese speakers in Venezuela (254,000), "
                                + "\nParaguay (212,000) and Uruguay (24,000).");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "Historical linguists trace the origin of the Ukrainian language to the Old East Slavic of the "
                                + "\nearly medieval state of Kyivan Rus. After the fall of the Kyivan Rus as well as the Kingdom of Rus, the language developed "
                                + "\ninto a form called the Ruthenian language. Along with Ruthenian, on the territory of modern Ukraine, the Kyiv version (izvod) "
                                + "\nof Church Slavonic was also used in liturgical services. The standard Ukrainian language is regulated by the National Academy "
                                + "\nof Sciences of Ukraine (NANU), particularly by its Institute for the Ukrainian Language, Ukrainian language-information fund, "
                                + "\nand Potebnia Institute of Linguistics. The Ukrainian language retains a degree of mutual intelligibility with Belarusian and Polish."
                                + "\n\nCountries where Ukrainian is spoken:"
                                + "\n--> There are approximately 527,000 Ukrainian speakers in South America, most of whom are in Brazil (500,000). "
                                + "\nThe rest live in Argentina (27,000).");
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "Dutch language, also called Netherlandic or Dutch Nederlands, in Belgium called Flemish or Flemish Vlaams, "
                                + "\na West Germanic language that is the national language of the Netherlands and, with French and German, one of the three official languages "
                                + "\nof Belgium. Although speakers of English usually call the language of the Netherlands “Dutch” and the language of Belgium “Flemish,” they are "
                                + "\nactually the same language. \n\nCountries where Dutch is spoken:"
                                + "\n--> Dutch just barely beat out French for tenth most spoken language. There are about 280,000 Dutch speakers in South America, all of whom live "
                                + "\nin Suriname — a former Dutch colony where Dutch is still the official language. There are only 231,000 French speakers in South America. They all live "
                                + "\nin French Guiana, a territory of France where French is the official language.");
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "For years now, Spain has enjoyed a covetable position as one of Europe’s best "
                                + "\ntravel destinations — especially for other Europeans looking for a warm and relaxing summer vacation. "
                                + "\nThat, along with the fact that 45 million Europeans claim Spanish as their mother tongue, is reason enough "
                                + "\nto start learning this language. (By the way, did you know that Spanish is one of the easiest languages for "
                                + "\nEnglish speakers to learn?). \n\nCountries where Spanish is spoken:"
                                + "\nSpanish’s prestige grows even more when leaving Europe: 20 countries have Spanish "
                                + "\ndeclared as an official language and over 480 million individuals are Spanish native speakers throughout the "
                                + "\nglobe, making it the second most widely-spoken language in the world.");
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "English, the global lingua franca has 400 million native speakers "
                                    + "worldwide, \nwith around 70 million living of those in Europe. \n\nCountries where English is spoken:"
                                + "\nIt’s the de facto (but not “official”) language of the United Kingdom "
                                + "and the Republic of Ireland, \nbut the large number of English-speaking expats residing in Europe "
                                + "also adds to this number. \nAs for second language speakers, about a third of older Europeans "
                                + "can speak English, \nwhile nearly half of 15- to 35-year-olds have a mastery of the language. "
                                + "\nThat said, some scholars theorize that the political realities of Brexit may weaken the dominance "
                                + "\nof English in Europe in the future. All the more reason to add another language under your belt now.");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, choose a valid number", "Error!", JOptionPane.ERROR_MESSAGE);    
                }
                break;
                
            case 5://CONTINENT
                lang = Integer.parseInt(JOptionPane.showInputDialog("    Choose a Language"
               + "\n\n1. SWAHILI\n2. YORUBA\n3. FRENCH\n4. PORTUGUESE\n5. ARABIC\n0. Exit"));
                
                switch(lang){
                    case 1://LANGIAGE
                        JOptionPane.showMessageDialog(null, "The most spoken language in Africa is Swahili which is said to have between "
                                + "\n100 and 150 million speakers. Known as a ‘Bantu’ language, Swahili apparently originated from other languages "
                                + "\nlike Arabic. Swahili is the main medium of instruction in schools and it’s not considered a difficult language "
                                + "\nto learn, especially if you already know some Arabic."
                                + "\nFun Fact? Swahili was the language used in The Lion King. Remember ‘Hakuna Matata’? That means no worries in Swahili "
                                + "\nand ‘Simba’ means ‘lion’! \n\nCountries where Swahili is spoken:"
                                + "\n--> This is the official language of Tanzania, Uganda, the Democratic Republic of Congo and Kenya, but it is also used "
                                + "\nin countries like Ethiopia, Sudan, Burundi, Rwanda, southern Somalia, northern Mozambique and the Comoros Islands");
                        break;
                        
                    case 2:
                        JOptionPane.showMessageDialog(null, "Yoruba language, one of a small group of languages that comprise the Yoruboid cluster of the "
                                + "\nDefoid subbranch of the Benue-Congo branch of the Niger-Congo language family. The other Yoruboid languages include Igala "
                                + "\nand Itsekiri. This African language has more than 15 dialects including Ekiti, Ijebu, Oworo, Ijesha and Akoko." 
                                + "\nFun Fact? The name Yoruba is also associated with the Yoruba Ethnic Group, which is one of the largest African ethnic "
                                + "\ngroups in the region. \n\nCountries where Yoruba is spoken:"
                                + "\n--> There are over 30 million Yoruba speakers in Nigeria, Benin and Togo combined, making it one of West Africa’s most "
                                + "\nspoken languages.");
                        break;
                        
                    case 3:
                        JOptionPane.showMessageDialog(null, "After Russian and German, the next most spoken language "
                                +"\nin Europe is French, with about 80 million native speakers. "
                                +"\n\nCountries where French is spoken:"
                                +"\nIt is the official language of France (of course), as well as a co-official language "
                                +"\nof Belgium, Switzerland and Luxembourg. If you consider the percentage "
                                +"\nof the population that learned French as a second language, then over 30% of European "
                                +"\ninhabitants know the language, making it a great choice for those that want to travel "
                                +"\naround the continent. That said, French’s global reach is even more impressive than its "
                                +"\nusefulness in Europe, as almost 30 countries claim French as an official language or an "
                                +"\nadministrative language!");
                        break;
                        
                    case 4:
                        JOptionPane.showMessageDialog(null, "In the world of languages, Portuguese is an up-and-comer. No longer stuck in the "
                                + "\nshadow of Spanish, it now has too many speakers and too much economic muscle for global businesses to ignore. "
                                + "\nPortuguese is the 6th most spoken language in the world. Portuguese has around 215 million native speakers. "
                                + "\nIt is the most spoken language in South America and the 2nd most spoken language in Latin America. "
                                + "\nThe Portuguese Empire was Europe’s first colonial empire. As a result, Portuguese is an official language "
                                + "\nin 9 countries in Europe, Asia, Africa and South America. Brazilian Portuguese is different from European Portuguese."
                                + "\n\nCountries where Portuguese is spoken:"
                                + "\n--> Brazil is home to the vast majority of those speakers (over 205 million) and is the only country in South America "
                                + "\nwhere Portuguese is the official language. There are also contingents of Portuguese speakers in Venezuela (254,000), "
                                + "\nParaguay (212,000) and Uruguay (24,000).");
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "As many as 420 million people around the world speak Arabic,"
                                + "making it the fifth most spoken language. \nThe word “Arab” means “nomad”, which makes sense"
                                + "considering Arabic originated from nomadic tribes \nin the desert regions of the Arabian Peninsula."
                                + "\nArabic language evolved from Nabataean Aramaic script and has been used since the 4th century CE."
                                + "\nIt is written from right to left, in a cursive style, and includes 28 letters similar to the English "
                                + "\nalphabet. Arabic belongs to the “Semitic” group of languages and is closely related to Hebrew and Aramaic."
                                + "\n\nCountries where Arabic is spoken:"
                                + "\n--> Egypt, Iraq, Jordan, Lebanon, Libya, Palesine, Qatar, etc.");
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, choose a valid number", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                break;
        }
       }while(cont != 0);
   } 
   
   public void Participants(){
       if(cont<5){
           JOptionPane.showMessageDialog(null, "There are "+cont+" students enrolled so far.");
       }else if(cont==5){
           JOptionPane.showMessageDialog(null, "The course quota is already full. You may start now.");
       }else{
           JOptionPane.showMessageDialog(null, "The course quota has been exceeded.");
       }   
   }
}
