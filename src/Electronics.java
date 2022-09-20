import java.util.Scanner;

public class Electronics {

    public static void main(String[] args) {
        eletronics();
    }

    static void eletronics() {

        System.out.println("welcome to eletronic section");
        System.out.println("------------------------------");
        System.out.println("1.laptop");
        System.out.println("2.Smartwatch and fitness");
        System.out.println("3.Headphone");
        System.out.println("4.Camera");

        System.out.println("select your section--->");


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1) {
            System.out.println("laptops -->");
            System.out.println("1.Lenovo");
            System.out.println("2.Asus");
            System.out.println("3.Dell");
            System.out.println("4.Hp");
            System.out.println("5.Acer");
            System.out.println("Select Brand-->");
            System.out.println("------------------");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println("lenovo---> ");
                System.out.println("--------------");
                System.out.println("1.lenovo ideapad slim 5");
                System.out.println("2.lenovo thinkbook 15");
                System.out.println("3.lenovo yoga slim 7");
                System.out.println("4.lemovo v15 ");
                System.out.println("5. lenovo E41-55");
                int c = sc.nextInt();
                if (c == 1) {
                    System.out.println("about---->\n" + "\n" +
                            "Brand\tLenovo\n" +
                            "Series\tIdeaPad 5\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tGRAPHITE_GREY\n" +
                            "Hard Disk Size\t512 GB\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tFingerprint Reader, Light Weight, Backlit Keyboard, Thin\n" +
                            "Graphics Card Description\tIntegrated");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\nprice=₹65,990/-");
                    int   price=65990;
                    System.out.println("you have purchased lenovo ideapad slim 5 successfully ");
                    System.out.println(price);


                } else if (c == 2) {

                    System.out.println(" about-->\n" + "Brand\tLenovo\n" +
                            "Series\tThinkBook 15\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tMineral Grey\n" +
                            "CPU Model\tCore i7\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tFingerprint Reader, Anti Glare Screen, Light Weight, Thin\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "CPU Speed\t2.8 GHz");
                    System.out.println("---------------------------------------------------------------------------------------------------------");

                    System.out.println("\nprice=₹76,000/-");
                } else if (c == 3) {
                    System.out.println("About this item ---->\n" + " \n" +
                            "Brand\tLenovo\n" +
                            "Series\tYoga Slim 7\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tSlate Grey\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tAnti Glare Screen, Light Weight, Thin, Built-in Microphone\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tIntel Iris Xe Graphics");
                    System.out.println("---------------------------------------------------------------------------------------------------------");

                    System.out.println("\nprice=₹72,990/-");
                } else if (c == 4) {
                    System.out.println("About this item----->\n" + "\n" +
                            "Brand\tLenovo\n" +
                            "Series\tYoga Slim 7\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tSlate Grey\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tAnti Glare Screen, Light Weight, Thin, Built-in Microphone\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tIntel Iris Xe Graphics");
                    System.out.println("---------------------------------------------------------------------------------------------------------");

                    System.out.println("\nprice=₹25,990/-");
                } else if (c == 5) {
                    System.out.println("About this item---->\n" + "Brand\tLenovo\n" +
                            "Model Name\tLenovo V15\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tIron Grey\n" +
                            "CPU Model\tCore i5 Family\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tAnti Glare Screen, Light Weight, Thin\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "CPU Speed\t3 GHz");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\nprice=₹22,999/-");
                }
            } else if (b == 2) {
                System.out.println("Asus---->");
                System.out.println("--------------");
                System.out.println("1.Asus vivobook s15");
                System.out.println("2.Asus zenbook 14 OLED");
                System.out.println("3.Asus chromebook flip c434");
                System.out.println("4. Asus tuf Gaming F15");
                System.out.println("5.Asus ROG Strix ");
                System.out.println("----------------------------------------------------------");

                int d = sc.nextInt();
                if (d == 1) {
                    System.out.println("about this item--->\n" + "\n" +
                            "Brand\tASUS\n" +
                            "Series\tVivobook S15 OLED (2022)\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tIndie Black\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tFHD (1920 x 1080) OLED 16:9 aspect ratio Display, 100% DCI-P3 color gamut, Fingerprint Recognition, Backlit Chiclet Keyboard with Num-key, Thunderbolt 4FHD (1920 x 1080) OLED 16:9 aspect ratio Dis… See more\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tIntel Iris Xe Graphics\n" +
                            "CPU Speed\t2.3 GHz ");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n ₹94,990");

                }
                if (d == 2) {
                    System.out.println("About this item\n" + "Brand\tASUS\n" +
                            "Series\tZenbook 14 OLED (2022)\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tPonder Blue\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\t100% DCI-P3 color gamut, Fingerprint Recognition, Backlit Chiclet Keyboard, 2.8K (2880 x 1800) OLED 16:10 aspect ratio Display, Thunderbolt 4100% DCI-P3 color gamut, Fingerprint Rec… See more\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tIntel Iris Xe Graphics\n" +
                            "CPU Speed\t2.1 GHz");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("\n₹1,03,025");
                }
                if (d == 3) {
                    System.out.println("About this item--->\n Brand\tASUS\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tSilver\n" +
                            "Hard Disk Size\t64 GB\n" +
                            "RAM Memory Installed Size\t64 GB\n" +
                            "Operating System\tChrome OS\n" +
                            "Special Feature\tTouchscreen\n" +
                            "Graphics Card Description\tIntel HD Graphics\n" +
                            "Graphics Coprocessor\tIntel HD Graphics\n" +
                            "Hard Disk Description\tEmbedded");
                    System.out.println("---------------------------------------");

                    System.out.println("\n₹60,000");


                }
                if (d == 4) {
                    System.out.println("About this item------>\n" +
                            " \n" +
                            "Brand\tASUS\n" +
                            "Series\tTUF Gaming F15\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tGray\n" +
                            "Hard Disk Size\t512 GB\n" +
                            "CPU Model\tCorei5-10300H\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 10 Home\n" +
                            "Special Feature\tAnti reflective\n" +
                            "Graphics Card");
                    System.out.println("--------------------------------");
                    System.out.println("\n₹52,990/-");
                }
                if (d == 5) {
                    System.out.println(" about item---->\n" +
                            "Brand\tASUS\n" +
                            "Model Name\tROG Strix G17 (2021)\n" +
                            "Screen Size\t17.3 Inches\n" +
                            "Colour\tEclipse Gray\n" +
                            "Hard Disk Size\t512 GB\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 10 Home\n" +
                            "Special Feature\tAnti Glare Screen\n" +
                            "Graphics Card Description\tDedicated\n" +
                            "Graphics Coprocessor\tNVIDIA GeForce GTX 1650");
                    System.out.println("----------------------------------------");
                    System.out.println("\n₹79,990");


                }


            } else if (b == 3) {
                System.out.println("Dell---->");
                System.out.println("--------------");
                System.out.println("1.Dell Inspiron");
                System.out.println("2.Dell Vostro 3420 Laptop");
                System.out.println("3.Dell Latitude 3340");
                System.out.println(" 4.Dell New 2022 Inspiron 3511 NB");
                System.out.println("5.Dell Inspiron 5518 Intel I5-11300H Laptop ");
                System.out.println("----------------------------------------------------------");

                int e = sc.nextInt();
                if (e == 1) {
                    System.out.println("about this item--->\n" + "\n" +
                            "Brand\tDell\n" +
                            "Series\tInspiron 7425\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tPebble Green\n" +
                            "CPU Model\tRyzen 7\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "CPU Speed\t2 GHz\n" +
                            "Hard Disk Description\tSSD ");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n ₹94,990");

                }
                if (e == 2) {
                    System.out.println("About this item\n" + "\n" +
                            "Brand\tDell\n" +
                            "Model Name\tVostro 3420\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tCarbon Black\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "CPU Speed\t2.4 GHz\n" +
                            "Hard Disk Description\tSSD");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n₹53,400");
                }
                if (e == 3) {
                    System.out.println("About this item--->\n" +
                            "\n" +
                            "Brand\tDell\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tGray\n" +
                            "Hard Disk Size\t256 GB\n" +
                            "CPU Model\tCore i3 4005U\n" +
                            "RAM Memory Installed Size\t256 GB\n" +
                            "Operating System\tWindows 10 Pro\n" +
                            "Graphics Coprocessor\tIntel\n" +
                            "Hard Disk Description\tSSD\n" +
                            "Item Weight");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\nPrice:\t₹21,189 ");

                }
                if (e == 4) {
                    System.out.println("About this item------>\n" +

                            " \n" +
                            "Brand\tDell\n" +
                            "Series\tInspiron 3511\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tSilver\n" +
                            "Hard Disk Size\t1280 GB\n" +
                            "CPU Model\tCore i3 Family\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tNew windows 11 and office 2021, slim, hinges very light\n" +
                            "Graphics Card \tIntegrated");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n ₹44,100/-");
                }
                if (e == 5) {
                    System.out.println(" about item---->\n" +
                            "\n" +
                            "Brand\tDell\n" +
                            "Series\tInspiron 5518\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tPlatinum Silver\n" +
                            "Hard Disk Size\t512 GB\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 10\n" +
                            "Special Feature\tFingerprint Reader, Backlit Keyboard\n" +
                            "Graphics Card \tDedicated");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("\n₹69,000\n ");
                }
            } else if (b == 4) {
                System.out.println("Hp---->");
                System.out.println("--------------");
                System.out.println("1.HP Pavilion x360");
                System.out.println("2.HP Chromebook x360 Intel Celeron N4120");
                System.out.println("3.HP 15s-Ryzen 3 5300U ");
                System.out.println(" 4.Hp Pavilion Gaming 15-Amd Ryzen 5 ");
                System.out.println("5.HP 15s");
                System.out.println("----------------------------------------------------------");

                int d = sc.nextInt();
                if (d == 1) {
                    System.out.println("about this item--->\n" + "\n" +
                            "\n" +
                            "Brand\tHP\n" +
                            "Model Name\t14-ek0086TU\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tSpace Blue\n" +
                            "CPU Model\tIntel Core i5\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tMult-touch Enabled, Full HD\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "CPU Speed\t4.4 GHz ");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n ₹69,990");

                }
                if (d == 2) {
                    System.out.println("About this item\n" + " Brand\tHP\n" +
                            "Series\tChromebook\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tForest Teal\n" +
                            "Hard Disk Size\t64 GB\n" +
                            "CPU Model\tCeleron N4020\n" +
                            "RAM Memory Installed Size\t4 GB\n" +
                            "Operating System\tChrome 64\n" +
                            "Special Feature\tTouchscreen, Micro-Edge\n" +
                            "Graphics Card Description\tIntegrated");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n₹23,999");
                }
                if (d == 3) {
                    System.out.println("About this item--->\n" +

                            " \n" +
                            "Brand\tHP\n" +
                            "Model Name\t15s-ey2000au\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tSilver\n" +
                            "CPU Model\tRyzen 3\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tFull HD, Micro-Edge Display\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tAM");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\nPrice:\t₹33,999 ");

                }
                if (d == 4) {
                    System.out.println("About this item------>\n" + "\n" +
                            "Brand\tHP\n" +
                            "Model Name\t15-EC2048AX\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tShadow Black\n" +
                            "Hard Disk Size\t512 GB\n" +
                            "CPU Model\tAMD Ryzen 5 5600X\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tAnti-glare, Micro-Edge\n" +
                            "Graphics Card Description\t ");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("\n ₹44,100/-");
                }
                if (d == 5) {
                    System.out.println(" about item---->\n" +
                            " Brand\tHP\n" +
                            "Model Name\t15s-fq2673TU\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tNatural Silver\n" +
                            "CPU Model\tCore i3\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tMicro-Edge Display\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "CPU Speed\t4.1 GHz");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n  ₹42,999");
                }

            } else if (b == 5) {
                System.out.println("Acer---->");
                System.out.println("--------------");
                System.out.println("1.Acer Aspire 5 Gaming Intel Core i5");
                System.out.println("2.Acer Nitro 5 Gaming Laptop");
                System.out.println("3.Acer Aspire 5  ");
                System.out.println("4.Acer Aspire Vero AV15-51-5155 Green Laptop");
                System.out.println("5.Acer Aspire 3 Intel Core");
                System.out.println("----------------------------------------------------------");

                int d = sc.nextInt();
                if (d == 1) {
                    System.out.println("about this item--->\n" + "\n" +
                            "Brand\tAcer\n" +
                            "Model Name\tAspire 5 Gaming\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tGray\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tAluminum Top Cover, Wi-Fi 6, Elevated Design, Thunderbolt 4\n" +
                            "Graphics Card Description\tDedicated\n" +
                            "Graphics Coprocessor\tNVIDIA GeForce RTX 2050\n" +
                            "CPU Speed\t3.3 GHz ");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n ₹63,990");

                }
                if (d == 2) {
                    System.out.println("About this item\n" + "\n" +
                            "Brand\tAcer\n" +
                            "Model Name\tAN515-57\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tBlack\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tBacklit Keyboard\n" +
                            "Graphics Card Description\tDedicated\n" +
                            "Graphics Coprocessor\t ");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n₹59,990");
                }
                if (d == 3) {
                    System.out.println("About this item--->\n" + "\n" +
                            "Brand\tAcer\n" +
                            "Model Name\tAspire 5\n" +
                            "Screen Size\t14 Inches\n" +
                            "Colour\tSilver\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tBluetooth 5.1\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tInt ");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\nPrice:\t₹44,990 ");

                }
                if (d == 4) {
                    System.out.println("About this item------>\n" + "\n" +
                            "Brand\tAcer\n" +
                            "Series\tAspire Vero\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tGray\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t16 GB\n" +
                            "Operating System\tWindows\n" +
                            "Special Feature\tFingerprint Reader, Webcam, Backlit Keyboard\n" +
                            "Graphics Card Description\tIntegrated\n" +
                            "Graphics Coprocessor\tIntel Iris Xe Graphics ");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n ₹44,100/-");
                }
                if (d == 5) {
                    System.out.println(" about item---->\n" +
                            " \n" +
                            "Brand\tAcer\n" +
                            "Series\tAspire 3\n" +
                            "Screen Size\t15.6 Inches\n" +
                            "Colour\tSilver\n" +
                            "Hard Disk Size\t1 TB\n" +
                            "CPU Model\tCore i5\n" +
                            "RAM Memory Installed Size\t8 GB\n" +
                            "Operating System\tWindows 11 Home\n" +
                            "Special Feature\tPortable\n" +
                            "Graphics Card Description\tIntegrated");
                    System.out.println("----------------------------------------------------------");

                    System.out.println("\n  ₹42,999");
                }
            }

        } else if (a == 2) {
            System.out.println("Smartwatch and fitness-->");
            System.out.println("1.Boat");
            System.out.println("2.noice");
            System.out.println("3.apple");

            System.out.println("--------------");
            System.out.println("Select model-->");


            System.out.println("------------------");
            int b = sc.nextInt();
            if (b == 1) {
                System.out.println("Boat---> ");
                System.out.println("--------------");
                System.out.println("1.boAt Xtend Smartwatch");
                System.out.println("2.boAt Wave Lite Smartwatch");
                System.out.println("3.boAt Flash Edition Smart Watch");
                System.out.println("4.boAt Flash Edition Smart Watch 1");
                System.out.println("5.boAt Wave Call Smart Watch ");
                int c = sc.nextInt();
                if (c == 1) {
                    System.out.println("about---->\n" + "\n" +
                            "Brand\tBoAt\n" +
                            "Style\tWith Alexa\n" +
                            "Colour\tPitch Black\n" +
                            "Special Feature\tSleep Monitor, Heart Rate Monitor\n" +
                            "Age Range \tYouth");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\nprice=\t₹2,099/-");
                } else if (c == 2) {

                    System.out.println(" about-->\n" + "\n" +
                            "Brand\tBoAt\n" +
                            "Model Name\tWave Lite\n" +
                            "Style\tBoat Watch\n" +
                            "Colour\tActive Black\n" +
                            "Screen Size\t1.69 Inches ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");

                    System.out.println("\nprice=₹1,999/-");
                } else if (c == 3) {
                    System.out.println("About this item ---->\n" + "\n" +
                            "Brand\tBoAt\n" +
                            "Style\tModern\n" +
                            "Colour\tLightning Black\n" +
                            "Screen Size\t1.3 Inches\n" +
                            "Special Feature ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");

                    System.out.println("\nprice=₹₹1,999/-");
                } else if (c == 4) {
                    System.out.println("About this item----->\n" + " \n" +
                            "Brand\tBoAt\n" +
                            "Style\tModern\n" +
                            "Colour\tLightning Black\n" +
                            "Screen Size\t1.3 Inches\n" +
                            "Special Feature\tCalorie Tracker, Heart Rate Monitor");
                    System.out.println("---------------------------------------------------------------------------------------------------------");

                    System.out.println("\nprice=₹2,990/-");
                } else if (c == 5) {
                    System.out.println("About this item---->\n" + "\n" +
                            "Brand\tBoAt\n" +
                            "Model Name\tWave Call\n" +
                            "Colour\tActive Black\n" +
                            "Special Feature\tBluetooth Calling, Multiple Sports Modes, Dial Pad, 150+ Watch Faces, 1.69\" HD Display\n" +
                            "Band Colour\tActive Black ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\nprice=₹2,799/-");
                }
            } else if (b == 2) {
                System.out.println("Noice---->");
                System.out.println("--------------");
                System.out.println("1.Crossbeats Orbit Bluetooth Calling Smart Watch Voice Assistant");
                System.out.println("2.Noise ColorFit Pulse Grand Smart Watch");
                System.out.println("3.Crossbeats Orbit Bluetooth Calling Smart Watch");
                System.out.println("4.Noise ColorFit Ultra Buzz Bluetooth Calling Smart Watch ");
                System.out.println("5.Noise Pulse Go Buzz Advanced Bluetooth Calling Smart Watch");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                int d = sc.nextInt();
                if (d == 1) {
                    System.out.println("about this item--->\n" + "\n" +
                            "Brand\tCrossBeats\n" +
                            "Model Name\tOrbit\n" +
                            "Style\tModern\n" +
                            "Colour\tGraphite Black\n" +
                            "Screen Size\t1.3 Inches ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹3,999");

                }
                if (d == 2) {
                    System.out.println("About this item\n" + "\n" +
                            "Brand\tNoise\n" +
                            "Model Name\tColorFit Grand\n" +
                            "Style\tColorFit Pulse Grand\n" +
                            "Colour\tJet Black\n" +
                            "Screen Size\t1.69 Inches ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹1,999");
                }
                if (d == 3) {
                    System.out.println("About this item--->\n Brand\tASUS\n" +
                            "\n" +
                            "Brand\tCrossBeats\n" +
                            "Model Name\tOrbit\n" +
                            "Style\tModern\n" +
                            "Colour\tGraphite Black\n" +
                            "Screen Size\t1.3 Inches");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹3,999");

                }
                if (d == 4) {
                    System.out.println("About this item------>\n" + "\n" +
                            "Brand\tNoise\n" +
                            "Model Name\tColorFit Ultra Buzz\n" +
                            "Style\tColorFit Ultra Buzz\n" +
                            "Colour\tCharcoal Black\n" +
                            "Special Feature\tSleep Monitor, Sedentary Reminder, GPS ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹2,999/-");
                }
                if (d == 5) {
                    System.out.println(" about item---->\n" + "\n" +
                            "Brand\tNoise\n" +
                            "Model Name\tColorFit Pulse Go Buzz\n" +
                            "Colour\tJet Black\n" +
                            "Connector Type\tUSB\n" +
                            "Water Resistance Level\tWater Resistant\n ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹2,499");
                }
            } else if (b == 3) {
                System.out.println("Apple---->");
                System.out.println("--------------");
                System.out.println("1.Apple Watch SE Smart Watch");
                System.out.println("2.APPLE Watch Series 8 GPS + Cellular");
                System.out.println("3.APPLE Watch Series7");
                System.out.println(" 4.APPLE Watch SE ");
                System.out.println("5.APPLE Watch SE GPS + Cellular");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                int d = sc.nextInt();
                if (d == 1) {
                    System.out.println("about this item--->\n" + "Key Features\n" +
                            "Smart Watch\n" +
                            "Compatible Devices: Smartphones\n" +
                            "Ideal For: Unisex\n" +
                            "Lifestyle: Fitness | Indoor | Swimming | Outdoor\n" +
                            "Basic Features: Alarm Clock | Calendar | Date & Time | Timer/Stop Watch\n" +
                            "Health Tracker: Exercise Tracker | Sleep Monitor | Heart Rate ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹27,900.00 ");

                }
                if (d == 2) {
                    System.out.println("About this item\n" + "Highlights\n" +
                            "Always-On Retina LTPO OLED display\n" +
                            "With Call Function\n" +
                            "Touchscreen\n" +
                            "Fitness & Outdoor\n" +
                            "Battery Runtime: Upto 18 hrs ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹53,400");
                }
                if (d == 3) {
                    System.out.println("About this item--->\n" +
                            "Highlights\n" +
                            "1-Always-on Retina display has nearly 20% more screen area than Series 6\n" +
                            "making everything easier to see and use\n" +
                            "2-The most crack-resistant front crystal yet on an Apple Watch\n" +
                            "IP6X dust resistance and swimproof design\n" +
                            "3-Measure your blood oxygen with a powerful sensor and app\n" +
                            "4-Take an ECG anytime\n" +
                            "anywhere\n" +
                            "5-Get high and low heart rate\n" +
                            "and irregular heart rhythm notifications\n" +
                            "6-Stay in the moment with the new Mindfulness app reach your sleep goals with the Sleep app\n" +
                            "7-Track new tai chi and pilates workouts\n" +
                            "in addition to favourites like running\n" +
                            "yoga\n" +
                            "swimming and dance\n" +
                            "With Call Function\n" +
                            "Touchscreen\n" +
                            "Notifier, Fitness & Outdoor\n" +
                            "Battery Runtime: Upto 18 hrs\n ");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\nPrice:\t₹39,189 ");


                }
                if (d == 4) {
                    System.out.println("About this item------>\n" + "Highlights\n" +
                            "Retina LTPO OLED display\n" +
                            "With Call Function\n" +
                            "Touchscreen\n" +
                            "Fitness & Outdoor\n" +
                            "Battery Runtime: Upto 18 hrs");
                    System.out.println("\n ₹25,100/-");
                }
                if (d == 5) {
                    System.out.println(" about item---->\n" +
                            " Highlights\n" +
                            "GPS + Cellular model lets you call, text and get directions without your phone\n" +
                            "Large Retina OLED display\n" +
                            "Up to 2x faster processor than Series 3\n" +
                            "Track your daily activity on Apple Watch and see your trends in the Fitness app on iPhone\n" +
                            "Measure workouts like running, walking, cycling, yoga, swimming and dance\n" +
                            "Swimproof design| Store and stream music and podcasts\n" +
                            "High and low heart rate notifications and irregular heart rhythm notification\n" +
                            "With Call Function\n" +
                            "Touchscreen\n" +
                            "Fitness & Outdoor\n" +
                            "Battery Runtime: Upto 18 hrs");
                    System.out.println("---------------------------------------------------------------------------------------------------------");
                    System.out.println("\n₹69,000\n ");
                } else {
                    System.out.println("You entered the wrong number ");
                }
            }
        } else if (a == 3) {
            System.out.println("welcome to Headphone -->");
            System.out.println("1.Boat");
            System.out.println("2.oneplus");
            System.out.println("3.oppo");
            System.out.println("-------------");
            System.out.println(" ");
            int d = sc.nextInt();
            if (d == 1) {
                System.out.println("boat----->\n " + "Highlights\n" +
                        "With Mic:Yes\n" +
                        "Bluetooth version: 5.2\n" +
                        "Wireless range: 10 m\n" +
                        "Battery life: 40 hrs\n" +
                        "Type-c Charging\n" +
                        "ASAP Charge: 10 mins charge= 10 hours playback\n" +
                        "IPX7: Water and Sweat Resistant\n" +
                        "Bluetooth version - 5.0-5.2 (Depending on the Stock Availability)\n" +
                        "Services\n" +
                        "1 Year Warranty from the Date of Purchase\n" +
                        "7 Days Replacement Policy?\n" +
                        "Cash on Delivery available?\n" +
                        "Seller\n" +
                        "SPLIPRLItech4.5 ");
                System.out.println(" -----------------------------------------------------------");
                System.out.println("\n price=₹1,299");
            }
            if (d == 2) {
                System.out.println(" oneplus--->\n" + "General\n" +
                        "Model Name\n" +
                        "Bullets Wireless Z2\n" +
                        "Color\n" +
                        "Acoustic Red\n" +
                        "Headphone Type\n" +
                        "In the Ear\n" +
                        "Inline Remote\n" +
                        "Yes\n" +
                        "Sales Package\n" +
                        "1 Headphone, Type C Cable, Earplug, User Guide, Membership Card\n" +
                        "Connectivity\n" +
                        "Bluetooth\n" +
                        "Headphone Design\n" +
                        "Behind the Neck ");
                System.out.println(" -----------------------------------------------------------");
                System.out.println("\n price=₹3,299");
            }
            if (d == 3) {
                System.out.println("About this item------->\n" +
                        "Ultra-light earbuds: Lightest true wireless in segment with merely 2grams per earbud! Airpop promises to uplift your mood with its cool, light and a compact built. Airpop was designed for the trendsetters who love to flaunt their music all day long.\n" +
                        "Studio quality sound: Take your music love to another level with the Crossbeats Airpop, upgraded 10mm driver setup along with built-in audio tuning makes these TWS a pleasure to lend an ear to!\n" +
                        "Styling unleased: 3 stunning colours, black, dark blue and neon green all here to light up your everyday look. Pick your favourite colour and flaunt a new style with Crossbeats Airpop!\n" +
                        "Auto-pairing powered by BT 5.1: Quit searching for Bluetooth names and re-pairing the earbuds every time you want to listen to music. The instant pairing feature on the Airpop enables you to connect in a jiffy if already paired to a particular smartphone or device. ");
                System.out.println(" -----------------------------------------------------------");
                System.out.println("\n price=₹4,299");

            }
        } else if (a == 4) {
            System.out.println("welcome to Camera -->");
            System.out.println("1.DSLR Camera");
            System.out.println("2.Mirrorless Camera");
            System.out.println("3.Security Camera");
            System.out.println("----------------------");
            System.out.println(" ");

            int d = sc.nextInt();
            if (d == 1) {
                System.out.println("\nDSLR Camera" + "\n" +
                        "Brand\tCanon\n" +
                        "Model Name\tEOS 1500D\n" +
                        "Form Factor\tDSLR\n" +
                        "Effective Still Resolution\t24.10\n" +
                        "Special Feature\tBuilt-in monaural microphone, Sound-recording level adjustable, wind filter provided\n" +
                        "Optical Zoom\t3 x\n" +
                        "Colour\tBlack\n" +
                        "Connector Type\tWiFi\n" +
                        "Screen Size\t3 Inches\n" +
                        "Photo Sensor Size\tAPS- ");
                System.out.println("------------------------------------");
                System.out.println("\n₹38,499");
            }
            if (d == 2) {
                System.out.println("About this item--------->\n" +
                        "Real time eye AF for still + Animal Eye AF\n" +
                        "Real time tracking\n" +
                        "World fastest 0.02 Sec AF speed with 425 phase detection and contrast points\n" +
                        "24.2MP, EXMOR CMOS sensor with outstanding light sensitivity\n" +
                        "11 FPS continuous shooting with AF/AE\n" +
                        "180 degree tilt able touch LCD screen\n" +
                        "ISO sensitivity up to 102400\n" +
                        "High resolution, sensitivity and colour reproduction capability\n" +
                        "Smooth and stable AF\n" +
                        "Country of Origin: China");
                System.out.println("------------------------------------");
                System.out.println("\n₹3,499");

            }
            if (d == 3) {
                System.out.println("About this item\n" +
                        "PROUDLY INDIAN: Qubo Smart Cam 360 is Designed & Made in INDIA. Engineered for the Security Needs of the Indian Market; TRUST OF HERO GROUP: Our Round-the-Clock Customer Service & Wide field Network not only resolves your all concerns & queries but rather ensures complete peace of mind for Lifetime.\n" +
                        "360 COVERAGE: The smart security camera supports Multi-Directional rotation of the lens ensuring that there are no blind spots. NOTE: Qubo Smart Cam 360 is designed to be used indoors only.\n" +
                        "THEFT PROOF CLOUD STORAGE: Unlike traditional CCTV cameras, you can secure all your recordings on cloud storage based in India. Your private home moments stay with you even if the device is stolen\n" +
                        "PERSON DETECTION WITH INTRUDER ALARM : The secutity camera has Advanced AI capabilities that can smartly detect & notify whenever a person is detected. You can also ring an automatic loud siren in case of an intrusion.");
                System.out.println("------------------------------------");
                System.out.println("\n₹2,499");
            }


        } else {
            System.out.println("You entered the wrong number ");
        }

    }
}


