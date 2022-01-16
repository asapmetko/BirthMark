package proje;
import java.util.*;

public class BirthMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hastanemize Hos Geldiniz!");
		Scanner girdi = new Scanner(System.in);
		System.out.print("Lutfen adinizi giriniz: ");
		String ad = girdi.next();
		System.out.print("Lutfen soyadinizi giriniz: ");
		String soyad = girdi.next();

		System.out.println("------------------------------\nKULLANICI BILGILERI\n------------------------------");
		System.out.println("Sayin "+ad+soyad+ " hastanemize hos geldiniz!");
		System.out.println("------------------------------");
		System.out.println("Lutfen asagidaki giris numaralarindan birini seciniz");
		
		
		System.out.println("Islemler:\n1-Hasta Giris\n2-Doktor Giris\n3-Medikal Astroloji\n4-Dogal Tedavi");
		int giris = girdi.nextInt();
        
		switch(giris){
		
		case 1:
			System.out.println("Lutfen islem numarasi seciniz:");
			System.out.println("Hasta Islemler:\n1-Randevu Al\n2-Sonuclari Gor");
			int islem= girdi.nextInt();
			if(islem==1)
			{
				Hasta hasta=new Hasta();
				System.out.println("Lutfen randevu almak istediginiz bransi giriniz:");
				String bransSec=girdi.next();
				hasta.doktorSec="\n1-Gozde Karatas Baydogmus\n2-Perihan Pehlivanoglu\n3-Ozgur Koray Sahingoz";
				System.out.println(hasta.giris1());
				int doktorSecim=girdi.nextInt();
				System.out.println("Lutfen haftanin kacinci gunu randevu olusturmak istediginizi giriniz: ");
				int gun=girdi.nextInt();
			      
			switch (gun)
				{
				
			case 1:
				  
			System.out.println("Haftanin "+gun+". gunu pazartesi randevunuz olusturuldu.\n"); 
				  break;
				
			case 2:
				System.out.println("Haftanin "+gun+". gunu sali randevunuz olusturuldu.\n"); 
				  break;
				
				
			case 3:
				  
				System.out.println("Haftanin "+gun+". gunu carsamba randevunuz olusturuldu.\n"); 
				  break;
				
				
			case 4:
				  
				System.out.println("Haftanin "+gun+". gunu persembe randevunuz olusturuldu.\n"); 
				  break;
			
				
			case 5:
				  
				System.out.println("Haftanin "+gun+". gunu cuma randevunuz olusturuldu.\n"); 
				  break;
			
			case 6:
				  
				System.out.println("Haftanin "+gun+". gunu cumartesi randevunuz olusturuldu.\n"); 
				  break;
				  
			
				
			case 7:
				  
				System.out.println("Haftanin "+gun+". gunu pazar randevunuz olusturuldu.\n"); 
				  break;
				  
			default:
				  
				System.out.println("Yanlis bir deger girdiniz. Yogunluktan dolayi birkac dakika sonra tekrar deneyiniz"); 
				  break;
				
			}
			   System.out.println("Lutfen doktor ve gununu belirlediginiz randevu saatinizi seciniz:");
				
				hasta.saat="\n1-10.30\n2-11.45\n3-15.00";
				System.out.println(hasta.giris1());
				int saat=girdi.nextInt();
				System.out.println("Haftanin "+gun+".gunu belirlediginiz saatte randevunuz olusturuldu. Lutfen zamaninda geliniz.");
			}	
			else {
				int [] kanSonuclari = new int[3];
		        
		        kanSonuclari[0]=5;
		        kanSonuclari[1]=kanSonuclari[0]*2;
		        kanSonuclari[2]=(kanSonuclari[1]-kanSonuclari[0])*3-2;
		        
		        for(int i=0;i<kanSonuclari.length;i++){
		            System.out.println("Kan"+i+".Degeri: "+kanSonuclari[i]);
		        }
			}
			break;	
				
			
		case 2:
		       int giris_hakki = 3;
		          String sys_kullanici_adi = "GozdeKaratas";// bellekte kay�tl� kullan�c� ad�
		          String sys_parola = "BirthMark";// bellekte kay�tl� parola
		        
		        System.out.println("*****************************");
		        System.out.println("Doktor Girisine Ho�geldiniz...");
		        System.out.println("*****************************");
		        
		        while (true) {
		            System.out.print("Kullanici Adi : ");
		            String kullanici = girdi.nextLine();// ekrandan al�nan kullan�c� ad�
		            System.out.print("\nParola : ");
		            String parola = girdi.nextLine();// ekrandan al�nan parola
		            
		            if (kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) { //kullan�c� ad� ve �ifre do�ru ise
		                System.out.println("Sayin "+kullanici+" , hastanemize hos geldiniz.");
		                break;  } //i�lem sonlans�n ve di�er ko�ul ifadelerini okumas�n
		           
		            /*buradan itibaren yaln�zca kullan�c� ad�n�n do�ru girildi�i, yaln�zca �ifrenin do�ru girildi�i ve ikisinin de
		             yanl�� girildi�i se�enekler olaca��ndan �� adet ko�ul ifadesi daha eklenmi�tir */
		            
		            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) { 
		                System.out.println("Parolaniz yanlis...");
		                giris_hakki -= 1;//giri� hakk� her seferinde bir azalt�l�r
		              System.out.println("Giris hakki : " + giris_hakki);                    }
		                
		                
		           
		            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
		                System.out.println("Kullanici adiniz yanlis...");
		                giris_hakki -= 1;
		                System.out.println("Giris hakki : " + giris_hakki);              }            

		            else {
		                System.out.println("Kullanici adiniz ve parolaniz yanlis...");
		                giris_hakki -= 1;
		                System.out.println("Giris Hakki : " + giris_hakki);            }

		            if (giris_hakki == 0){
		                System.out.println("Giris hakkiniz bitti. Lutfen birkac dakika sonra tekrar deneyiniz....");
		                break;             }}
		        
		        System.out.println("Acilen degerlendirmeniz gereken hastanizin kan sonuclari aciklanmistir. Degerler ekraniniza yansitilacaktir.");
				
		        
		        
		        double[] dizi = { 2.4, 0.5, 5.0, -3.5, 5.5, 1.7, 9.7, 6.5 };
		        double enKucuk = dizi[0];
		        double enBuyuk=dizi[0];
		 
		        for (double sayi: dizi) {
		            if(enKucuk > sayi)
		                enKucuk = sayi;
		            else
		            	enBuyuk=sayi;
		        }
		 
		       
		        System.out.println( "Hastanin en kucuk degeri :  " + enKucuk +"tur. Acilen degerlendirilmelidir." );
		        System.out.println( "Hastanin en buyuk degeri ise:  " + enBuyuk +"tur. Acilen degerlendirilmelidir." ); 
		        
		        System.out.println("*****************************");
		        System.out.println("Cozum ekranina yonlendiriliyorsunuz...");
		        System.out.println("Lutfen hastaniz icin uygun tedavi yontemini seciniz: ");
		        System.out.println("\n1-Recete yaz.\n2-Covid-19 testi iste.\n3-K�rm�z� alan ac.\n4-Sari alan ac\n5-Yesil alan ac.");
		        int tedaviSec=girdi.nextInt();
		        switch(tedaviSec) {
		case 1:
		        	System.out.println("Lutfen belirlediginiz tedavi yontemini ve gereken ilaclari yaziniz: ");
		        	int tedaviOlusturuldu=girdi.nextInt();
		        	System.out.println("Tedavi yontemi olusturuldu. Hastaniza aktarilacaktir. Saglikli gunler dileriz :)");
		        	break;
		       
		
		case 2:      	System.out.println("********COVID-19 BILGILENDIRME****************");
		        	System.out.println("COVID-19, farkl� ki�ileri farkl� �ekillerde etkilemektedir. Enfekte ki�ilerin �o�u, hafif ila orta d�zeyde semptomlar geli�tirmekte ve hastaneye kald�r�lmadan iyile�mektedir.");
		        	System.out.println("En yayg�n semptomlar ates, oksuruk, yorgunluk, tat alma veya koku alma duyusunun kayb�dir.");
		        	System.out.println("Daha seyrek gorulen semptomlar ise ciltte dokuntu ya da el veya ayak parmaklarinda renk degisimi, ishaldir.");
		        	System.out.println("*****************************");
		        	System.out.println("Hastaniz icin Covid-19 test kaydi olusturdunuz. Saglikli gunler dileriz :)");
		        	break;
		        
		case 3:
		        	System.out.println("K�rm�z� alan birimi, hayati tehlike ta��yan a��r yaralanma ya da a��r hastal�k ge�irme durumlar� ile ilgilenmektedir."
		        			+ " K�rm�z� alana dahil edilen hastalar en acil durumu gerektiren s�n�fta yer almaktad�r");
		        	System.out.println("Hastaniz icin kirmizi alan olusturdunuz. Saglikli gunler dileriz :)");
		        	
		        	break;
		case 4:
		        	System.out.println("Sar� alan, ki�inin ge�irdi�i bir kaza, travma vb. sonucunda v�cudunda kal�c� hasar olu�ma riski olan hastal�klara sahip olmas� durumunda yap�lacak t�bbi m�dahale i�in sar� alan birimi hizmet vermektedir. ");
		            System.out.print("Sar� alana y�nlendirilen hastalar, m�dahaleden �nce bir s�re bekleyebilmektedir.");
		            System.out.println("Hastaniz icin sari alan olusturdunuz. Saglikli gunler dileriz :)");
		            break;
		case 5:
		        	System.out.println("Ye�il alan: Hafif yaralanma ve hastal�k durumlar�nda ye�il alan birimi hizmet vermektedir. Ye�il alandaki hastalar�n sa�l�k durumu, sar� ve k�rm�z� alandaki hastalara g�re daha az aciliyet bar�nd�rmaktad�r. ");
		        	System.out.println("Bu sebeple, bu gruptaki hastalar �zellikle kalabal�k hastanelerde uzun s�re bekleyebilmektedir");
		        	System.out.println("Hastaniz icin yesil alan olusturdunuz. Saglikli gunler dileriz :)");
		            break;
		 default:System.out.println("Gecersiz bir islem numarasi sectiniz.");
		 
		        }
		break;
		case 3: 
			System.out.println("**********MEDIKAL ASTROLOJI*********");
		    System.out.println("Islem numarasi seciniz:");
		    System.out.println("\n1-Burc Hesaplama \n2-Burclar ve Yaygin Hastaliklari\n3-Pozitif Gun Hesaplayici");
		    int astrolojiSecim=girdi.nextInt();
		    switch(astrolojiSecim) {
		  case 1:
		    int ay,gun;
	        String burc = null;
	        System.out.println("------------------------------\nBURC HESAPLAMA\n------------------------------");
	        System.out.println("Lutfen dogdugunuz ayi giriniz(1 ile 12 aras�nda)=");
	        ay=girdi.nextInt();
	        while(ay<1||ay>12){
	        System.out.println("L�tfen dogdugunuz ayi giriniz(1 ile 12 aras�nda)=");
	        ay=girdi.nextInt();
	        }
	        System.out.println("Lutfen dogdugunuz gunu giriniz(1den 31e kadar)=");
	        gun=girdi.nextInt();
	        while(gun<1||gun>31){
	        System.out.println("Lutfen dogdugunuz gunu giriniz(1den 31e kadar)=");
	        gun=girdi.nextInt();
	        }
	        if(ay==1){
	            if(gun<=19){burc="oglak";}
	            if(gun>19){burc="kova";}
	        }
	        if(ay==2){
	            if(gun<=18){burc="kova";}
	            if(gun>18){burc="balik";}
	        }
	        if(ay==3){
	            if(gun<=19){burc="balik";}
	            if(gun>19){burc="koc";}
	        }
	        if(ay==4){
	            if(gun<=19){burc="koc";}
	            if(gun>19){burc="boga";}
	        }
	        if(ay==5){
	            if(gun<=20){burc="boga";}
	            if(gun>20){burc="ikizler";}
	        }
	        if(ay==6){
	            if(gun<=21){burc="ikizler";}
	            if(gun>21){burc="yengec";}
	        }
	        if(ay==7){
	            if(gun<=22){burc="yengec";}
	            if(gun>22){burc="aslan";}
	        }
	        if(ay==8){
	            if(gun<=22){burc="aslan";}
	            if(gun>22){burc="basak";}
	        }
	        if(ay==9){
	            if(gun<=22){burc="basak";}
	            if(gun>22){burc="terazi";}
	        }
	        if(ay==10){
	            if(gun<=22){burc="terazi";}
	            if(gun>22){burc="akrep";}
	        }
	        if(ay==11){
	            if(gun<=21){burc="akrep";}
	            if(gun>21){burc="yay";}
	        }
	        if(ay==12){
	            if(gun<=21){burc="yay";}
	            if(gun>21){burc="o�lak";}
	        }
	        System.out.println("Burcunuz:"+burc);
	        System.out.println("-----------------------------------------");
	        break;
		  case 2:
			   System.out.println("------------------------\nBURCLAR VE YAYGIN HASTALIKLARI\n-------------------------");
			   System.out.println("Lutfen burcunuza ait numarayi giriniz:");
			   System.out.println("\n1-Koc\n2-Boga\n3-Ikizler\n4-Yengec\n5-Aslan\n6-Basak\n7-Terazi\n8-Akrep\n9-Yay\n10-Oglak\n11-Kova\n12-Balik");
			   int burcNo=girdi.nextInt();
		    if(burcNo==1) {
		    System.out.println("KOC BURCU: Koc burcunun ya da yukseleni Koc olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler kafa, yuz ve g�zlerken;"
		    		+ "Koc burcundan olanlar genellikle bas agrisi, ates, sinir sikismasi, goz problemleri, isilik ve yangi gibi deri problemleri yasarlar. "
		    		+ "Bu burctan olan kisilerin beslenmelerinde yer vermeleri gereken yiyecekler; cig sebzeler, tavuk, balik, sut ve sut urunleri,"
		    		+ "meyve ve sebze sulari ve meyvelerden ozellikle turuncgillerdir. Koc burclari bol su ve bitki cayi icmeyi ihmal etmemeli, aldiklari"
		    		+ "kafein miktarini da azaltmalidirlar. Uzak durmalari gereken yiyecekler ise mayonez, soslar, makarna, yagli ya da kizartilmis"
		    		+ "yiyeceklerdir.");
		    }
		    if(burcNo==2) {
		    	System.out.println("BOGA BURCU: Boga burcunun ya da yukseleni Boga olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler boyun"
		    			+ "kulaklar, bogaz, girtlak, bademcikler ve ses telleridir. Boga burcundan olanlar bogaz bolgesini etkileyen hastaliklar"
		    			+ "ve tiroit rahatsizligi yasayabilirler. Bu burctan olan kisilerin beslenmelerinde yer vermeleri gereken yiyecekler light "
		    			+ "urunlerden ziyade yagindan arindirilmis gidalar olmalidir. Tavuk ya da hindi eti, tam tahilli bugday ekmegi, salata "
		    			+ "ve baklagiller de beslenmelerinde yer vermeleri gereken yiyeceklerdir. Boga burcunun tatli gidalardan,sekerlemelerden,"
		    			+ "biskuvi ve cikolatan uzak durmasi gerekir.");	
		    }
	        if(burcNo==3) {
	        	System.out.println("IKIZLER BURCU: Ikizler burcunun ya da yukseleni ikiz olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler kollar, omuzlar,"
	        			+ ",kaslar ve bu bolgedeki kemikler, akcigerler (Soluk borusu ve Bronsit) ve ellerdir.Ik�zler burcundan olanlar bronsit, tuberkuloz, astim,"
	        			+ ",sinir hastaliklari,kansizlik, zature, akciger zari iltihabi gibi rahatsizliklar yasayabilirler. Bu burctan olan kisilerin beslenmelerinde "
	        			+ "agirlikli olarak sebze ve proteine yer vermeleri gerekir. Ozellikle baklagiller, soya, yagli tohumlar, zeytinyagi, yumurta, "
	        			+ "balik, tavuk, hindi ve tavuk cigeri tuketmelerinde yarar vardir. Meyve yemeye de ozen gostermelidirler. Alkollu iceceklerden"
	        			+ "ya da alkolsuz sekerli kokteyllerden uzak murmalari, bol su tuketmeleri gerekir.");
	        }
	        if(burcNo==4) {
	        	System.out.println("YENGEC BURCU: Yengec burcunun ya da yukseleni yengec olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler mide, meme,"
	        			+ "diyafram, karaciger ust bolumu ve karin boslugudur. Yengec burcundan olanlar genellikle hazimsizlik, gaz sikismasi ve sindirim sorunlari"
	        			+ "yasarlar. Bu burctan olan kisilerin beslenmelerinde dogal ve islenmemis gidalara yonelmelerinde fayda vardir. Ozellikle yesil sebzeler, "
	        			+ "tahillar, kahverengi pirinc ve turuncgilleri bol miktarda tuketmelidirler. Sekerli yapay iceceklerden uzak durmali, bitki cayi, meyve suyu,"
	        			+ "ya da maden suyu icmelidirler.");					
	        }
	        if(burcNo==5) {
	        	System.out.println("ASLAN BURCU: Aslan burcunun ya da yukseleni aslan olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler"
	        			+ "kalp, omurga ve disklerdir. Aslan burcundan olanlar kalp sorunlari, zayif kan dolasimi ve tansiyon problemleri yasayabilirler. Bu burctan olan"
	        			+ "kisilerin beslenmelerinde balik ve ciger tuketmeleri gerekir. Yag orani azaltilmis ya da yagsiz sut ve sut urunleri turuncgiller ve yesil"
	        			+ "yaprakli sebzeleri beslenmelerine muhakkak ilave etmelidirler. Uzak durmalari gereken yiyecekler ise tuz ve tuz miktari fazla gidalardir.");
	        }
	        if(burcNo==6) {
	        	System.out.println("BASAK BURCU: Basak burcunun ya da yukseleni basak olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler bagirsaklar, sindirim kanali"
	        			+ "ve karaciger alt bolumudur. Basak burcundan olanlar sindirim sorunlari ve gaz, kabizlik ya da ishal gibi bagirsak sikayetleri siklikla yasayabilirler."
	        			+ "Bu burctan olan kisilerin beslenmelerinde salata ve yesil sebzelere agirlik vermeleri gerekir. Elma, yagli tohumlar, kuru meyveler, patates ve"
	        			+ "ekmek tuketmeye, taze meyve sulari ve bitki caylari icmeye ozen gostermelidir. Kahveden tam anlamiyla uzak durmalarina gerek yoktur, ancak"
	        			+ "azaltmalarinda fayda vardir.");
	        }
	        if(burcNo==7) {
	        	System.out.println("TERAZI BURCU: Terazi burcunun ya da yukseleni terazi olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler bobrekler, rahim, apandis, bel"
	        			+ "omurlari ve ciltleridir. Terazi burcundan olanlar bobreklerin islevinde zayiflama, bel omurgasinda sinir sikismasi ya da disk kaymasi, bel fitigi gibi"
	        			+ "rahatsizliklar yasayabilir. Bu burctan olan kisilerin beslenmelerinde kesinlikle alkole yer vermemeleri, bobreklerinin zayif olmasi ve ciltlerinin kuru"
	        			+ "olmasi nedeniyle bol miktarda su tuketmeleri gerekir. Egzotik meyveler, elma, armut, yagli tohumlar, ekmek, ciger, yumurta, pirinc, sut ve sut urunleri"
	        			+ "beslenme programlarinda muhakkak yer almalidir.");
	        }
	        if(burcNo==8) {
	        	System.out.println("AKREP BURCU: Akrep burcunun ya da yukseleni akrep olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler ureme organlari, kolon ve rektum ve "
	        			+ "idrar torbasidir. Akrep burcundan olanlar ureme organlari ile ilgili sikintilar, kolon-rektum rahatsizliklari ve idrar yolu enfeksiyonu ya da iltihabi"
	        			+ "yasayabilirler. Bu burctan olan kisilerin beslenmelerinde sebze, protein, yagi azaltilmis ya da yagsiz sut ve sut urunleri, yagsiz et, sebze sulari,"
	        			+ "patates ve yagli tohumlara yer vermeleri gerekir. Kremali soslardan ve gece atistirmalarindan uzak durmalarinda fayda vardir.");
	        }
	        if(burcNo==9) {
	        	System.out.println("YAY BURCU: Yay burcunun ya da yukseleni yay olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler kalca, basen, bacaklarin ust kisimlari ve "
	        			+ "kalca sinirleridir. Yay burcundan olanlar gut hastaligi, romatizma ve siyatik gibi rahatsizliklar yasayabilirler. Bu burctan olan kisilerin "
	        			+ "beslenmelerinde kesinlikle kahvalti ogununu atlamamalari gerekir. Bunun yaninda yagli tohumlar, sut ve sut urunleri, muz ve sebze (cig, izgara,"
	        			+ "buharda pisirilmis ya da haslanmis) beslenme planlarinda yer almasi gereken gidalardir. Yagsiz et tuketmeli, sekerli iceceklerden uzak durmalidirlar.");
	        }
	        if(burcNo==10) {
	        	System.out.println("OGLAK BURCU: Oglak burcunun ya da yukseleni oglak olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler diz, diz kapagi ve saclaridir."
	        			+ "Oglak burcundan olanlar deri hastaliklari, diz kapaginda eklem sivisi azalmasi ve buna bagli agrilar, eklem agrilari, sac derisi problemleri,"
	        			+ "kepeklenme ve sedef yasayabilirler. Bu burctan olan kisilerin beslenmelerinde corba, meyve suyu, bitki caylari, meyce, yagli tohumlar ve balik"
	        			+ "muhakkak yer almalidir. Uzak durmalari gereken gidalar ise kaz ya da ordek eti, tuz ve gece atistirmalaridir.");
	        }
	        if(burcNo==11) {
	        	System.out.println("KOVA BURCU: Kova burcunun ya da yukseleni kova olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler bilekler, bacaklarin alt kisimlari,"
	        			+ "disler ve dolasim sistemidir. Kova burcundan olanlar bilek burkulmalari, varis, asiri asabiyet ve kan zehirlenmesi gibi rahatsizliklar yasayabilirler."
	        			+ "Bu burctan olan kisilerin beslenmelerinde yumurta, yagli tohumlar, salata, esmer seker, rafine edilmemis yaglar, seftali, greyfurt ve yulaf ezmesine yer"
	        			+ "vermeleri gerekir. Cok fazla miktarda hayvansal gida tuketmemelerinde fayda vardir.");
	        }
	        if(burcNo==12) {
	        	System.out.println("BALIK BURCU: Balik burcunun ya da yukseleni balik olanlarin vucudunda en cok rahatsizlik yasadigi bolgeler ayak ve topuklardir. Balik burcundan"
	        			+ "olanlar tansiyon, grip, soguk alginligi, balgam ve oksuruk problemleri yasayabilirler. Bu burctan olan kisiler bol miktarda sivi tuketmeye ozen gostermeli,"
	        			+ "alkolu hayatlarindan kesinlikle cikarmalidirlar. Beslenmelerinde tahilli gidalar, sebze, balik ve tavuk alimina dikkat etmelidirler. Tuzdan uzak duramayanlar"
	        			+ "olabildigince azaltmaya calismalidirlar.");
	        }
	        System.out.println("----------------------------");
	    break;
	    
		  case 3:
			  System.out.println("--------------------------\nPOZTIF GUN HESAPLAYICI\n---------------------------");
			  double bugunYil,bugunAy;
			  Random r=new Random(); 
				  System.out.print("Merhaba "+ad+". Lutfen bulundugumuz yili girer misin?:");
				  bugunYil=girdi.nextDouble();
				  System.out.print("Sevgili "+ad+", simdi bulundugumuz ayi da girebilir misin?:");
				  bugunAy=girdi.nextDouble();
				  while (bugunAy<=0 || bugunAy>12)
				  { System.out.println("Girdiginiz ay hatali! ");
				  System.out.print("Lutfen bulundugumuz ayi tekrar girer misin?");
				  bugunAy=girdi.nextDouble();
				  }


				  if(bugunYil%4==0){
				  if(bugunAy==2)
				  {System.out.println("bu ayda "+"29"+" gun vardir");
				  
				  int a=r.nextInt(29);
				   System.out.println("Bu ay gecireceginiz en pozitif gun ayin "+a+". gunudur :)"); }
				  else if(bugunAy==4 || bugunAy==6 ||bugunAy==9 ||bugunAy==11)
				  {System.out.println("bu ayda "+"30"+" gun vardir");
				  int a=r.nextInt(30);
				   System.out.println("Bu ay gecireceginiz en pozitif gun ayin "+a+". gunudur :)"); 
				  }
				  else
				  {System.out.println("bu ayda "+"31"+" gun vardir");
				  int a=r.nextInt(31);
				   System.out.println("Bu ay gecireceginiz en pozitif gun ayin "+a+". gunudur :)"); }
				  }



				  else if(bugunYil%4!=0){
				  if(bugunAy==4 || bugunAy==6 ||bugunAy==9 ||bugunAy==11)
				  {System.out.println("bu ay "+"30"+" ceker");
				  int a=r.nextInt(30);
				   System.out.println("Bu ay gecireceginiz en pozitif gun ayin "+a+". gunudur :)"); 
				  }
				  else if(bugunAy==2)
				  {System.out.println("bu ay "+"28"+" ceker");
				  int a=r.nextInt(28);
				   System.out.println("Bu ay gecireceginiz en pozitif gun ayin "+a+". gunudur :)"); }
				  else
				  {System.out.println("bu ay "+"31"+" ceker");
				  int a=r.nextInt(31);
				   System.out.println("Bu ay gecireceginiz en pozitif gun ayin "+a+". gunudur :)"); }

		    } }
		    System.out.println("------------------------");
		    break;
		   
		case 4:
			System.out.println("------------------------------\nDOGAL TEDAVI\n------------------------------");
			
			DogalTedavi dogalTedavi=new DogalTedavi();
			dogalTedavi.uyari();
			
			
			System.out.println("Elma: C ve E vitamini kaynagidir. Bagirsak sisteminin duzenlenmesine katki saglar.");
			System.out.println("Kiraz: C vitamini ve kalsiyum barindiran bu meyve  cocuklarin gelismesine katki sagladigi gibi yetiskinlerde de dis ve kemik gelisimini destekler.");
			System.out.println("Dut: B vitamini ve C vitamini a��s�ndan zengin olan meyvenin �dem at�c� ve idrar s�kt�r�c� etkisi bulunur.");
			System.out.println("Armut: Fosfor, potasyum ve kalsiyum i�eren meyve, kalp ve damar hastal�klar�na iyi gelir. Tansiyon dengesinin korunmas�na yard�mc� olan armut, posa bak�m�ndan da zengindir.");
			System.out.println("Erik: A vitamini olan meyveler aras�nda belki de en �ok sevileni eriktir. Bir de yan�nda tuz oldu mu lezzetine doyum olmaz. Kendinizi yorgun hissetti�iniz d�nemlerde doktorunuza dan��arak erik t�ketimini artt�rabilirsiniz. Diren� artt�r�c� etkisi size iyi gelecektir.");
			System.out.println("Vi�ne: Karaci�er �zerinde olumlu etkileri olan meyve, A vitamini ve potasyum a��s�ndan zengindir.");
			System.out.println("�eftali: Hazm� kolayla�t�ran meyve, C vitamini ve posa a��s�ndan zengindir.");
			System.out.println("B���rtlen: Yabani meyveler aras�nda belki de en �ok sevileni denebilir. Mor meyveler akla ilk gelen meyve A, C ve E vitamini a��s�ndan zengindir.");
			System.out.println("Portakal: Ba����kl�k sitemini g��lendiren, kalp ve atardamarlar� koruyan, kans�zl��a iyi gelen meyve, i�eri�indeki C vitamini ve flavonoid sayesinde antioksidan deposudur.");
			System.out.println("Mandalina: C vitamini ve A vitamini a��s�ndan zengin olan meyvede ayn� zamanda potasyum da bulunur. Ba����kl�k sistemini g��lendirerek hastal�klara kar�� kalkan olu�turur.");
			System.out.println("Nar: Kansere kar�� koruyucu olan meyve �ok g��l� bir antioksidand�r. Demir, C vitamini ve potasyum deposudur.");
			System.out.println("�ilek: Kas ve eklem a�r�lar�na iyi gelen meyvede bol miktarda A, C, E vitaminleri ve folik asit vard�r.");
			System.out.println("Ananas: A ve C vitamini a��s�ndan zengin olan meyvede ayn� zamanda potasyum, fosfor ve demir bulunur. Cilt sa�l���na faydal�, �dem s�kt�r�c� ve zindeli�i artt�r�c� etkisi vard�r.");
			System.out.println("Hindistan Cevizi: Biz kuzeylilerin her zaman ilgisini �ekmi�tir. Meyve diyeti yapanlar da s�kl�kla hindistan cevizi ya��n� kullan�r. ��eri�inde A, E ve K vitamini bulunduran meyde ayn� zamanda sodyum, potasyum, kalsiyum ve demir a��s�ndan zengindir.");
			System.out.println("Ananas: A ve C vitamini a��s�ndan zengin olan meyvede ayn� zamanda potasyum, fosfor ve demir bulunur. Cilt sa�l���na faydal�, �dem s�kt�r�c� ve zindeli�i artt�r�c� etkisi vard�r.");
	
			break;
		}}}
	

