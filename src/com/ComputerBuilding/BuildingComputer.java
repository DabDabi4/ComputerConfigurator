package com.ComputerBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.Elements.*;
public class BuildingComputer {
    private Monitor monitor;
    private VideoCard videoCard;
    private HDD hdd;
    private SSD ssd;
    private Motherboard motherboard;
    private Keyboard keyboard;
    private Mouse mouse;

    private boolean isAssemblyStarted = false;
    private boolean isAssemblyComplete= false;


    private final List<Object> addElements = new ArrayList<Object>();

    public void startAssembly() {
        Scanner menu = new Scanner(System.in);
        while (!isAssemblyComplete) {
            if (!isAssemblyStarted) {
                System.out.println("Розпочати збірку комп'ютера? +/-");
                isAssemblyStarted = true;
            } else {
                System.out.println("Продовжити збірку комп'ютера? +/-");
            }
            if (menu.next().equals("+")) {
                System.out.println("Оберіть компонент: ");
                System.out.println("1: HDD");
                System.out.println("2: SSD");
                System.out.println("3: Монітор");
                System.out.println("4: Клавіатура");
                System.out.println("5: Мишка");
                System.out.println("6: Відеокарта");
                System.out.println("7: Материнська плата");

                int element = menu.nextInt();
                switch (element) {
                    case 1:
                        System.out.println("Оберіть HDD: ");
                        showElementModels();
                        int hddElement = menu.nextInt();
                        HDD hdd = new HDD(choiceElementModel(hddElement));
                        setHdd(hdd);
                        addElements.add(hdd);
                        System.out.println("HDD додано до комп'ютера");
                        break;
                    case 2:
                        System.out.println("Оберіть SSD: ");
                        showElementModels();
                        int ssdElement = menu.nextInt();
                        SSD ssd = new SSD(choiceElementModel(ssdElement));
                        setSsd(ssd);
                        addElements.add(ssd);
                        System.out.println("SSD додано до комп'ютера");
                        break;
                    case 3:
                        System.out.println("Оберіть монітор: ");
                        showElementModels();
                        int monitorElement = menu.nextInt();
                        Monitor monitor = new Monitor(choiceElementModel(monitorElement));
                        setMonitor(monitor);
                        addElements.add(monitor);
                        System.out.println("Монітор додано до комп'ютера");
                        break;
                    case 4:
                        System.out.println("Оберіть клавіатуру: ");
                        showElementModels();
                        int keyboardChoice = menu.nextInt();
                        Keyboard keyboard = new Keyboard(choiceElementModel(keyboardChoice));
                        setKeyboard(keyboard);
                        addElements.add(keyboard);
                        System.out.println("Клавіатуру додано до комп'ютера");
                        break;
                    case 5:
                        System.out.println("Оберіть мишку: ");
                        showElementModels();
                        int mouseChoice = menu.nextInt();
                        Mouse mouse = new Mouse(choiceElementModel(mouseChoice));
                        setMouse(mouse);
                        addElements.add(mouse);
                        System.out.println("Мишку додано до комп'ютера");
                        break;
                    case 6:
                        System.out.println("Оберіть відеокарту: ");
                        showElementModels();
                        int videocardElement = menu.nextInt();
                        VideoCard videoCard = new VideoCard(choiceElementModel(videocardElement));
                        setVideoCard(videoCard);
                        addElements.add(videoCard);
                        System.out.println("Відеокарту додано до комп'ютера");
                        break;
                    case 7:
                        System.out.println("Оберіть материнську плату: ");
                        showElementModels();
                        int motherboardElement = menu.nextInt();
                        Motherboard.MotherboardBuilder motherboardBuilder = new Motherboard.MotherboardBuilder();
                        System.out.println("Оберіть процесор для материнської плати: ");
                        showElementModels();
                        int processorElement = menu.nextInt();
                        motherboardBuilder.setProcessor(
                            new Processor(choiceElementModel(processorElement)));
                        System.out.println("Оберіть RAM для материнської плати: ");
                        showElementModels();
                        int ramElement = menu.nextInt();
                        motherboardBuilder.setRAM(new RAM(choiceElementModel(ramElement)));
                        Motherboard motherboard = motherboardBuilder.build(
                            choiceElementModel(motherboardElement));
                        setMotherboard(motherboard);
                        addElements.add(motherboard);
                        System.out.println("Материнську плату додано до комп'ютера");
                        break;
                    default:
                        System.out.println("Обрано невірний пункт");
                }
            } else {
                isAssemblyComplete = true;
                System.out.println("Збірка комп'ютера завершена");
                showElement();
            }
        }
        menu.close();
    }

    private void showElement() {
        System.out.println("Елементи комп'ютера:");
        for (Object currentComponent : addElements) {
            System.out.println(currentComponent.toString());
        }
    }

    private void showElementModels() {
        System.out.println("1: " + "Intel FR35");
        System.out.println("2: " + "NVIDIA 32У5");;
        System.out.println("3: " + "MSI B450");
        System.out.println("4: " + "AMD 7362");
        System.out.println("5: " + "ASUS 325А");

    }

    private String choiceElementModel(int choice) {
        if (choice == 1) {
            return "Intel FR35";
        } else if (choice == 2) {
            return "NVIDIA 32У5";
        } else if (choice == 3) {
            return "MSI B450";
        } else if (choice == 4) {
            return "AMD 7362";
        } else if (choice == 5) {
            return "ASUS 325А";
        } else {
            System.out.println("Обрано невірний пункт");
            return null;
        }
    }


    private void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
    private void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
    private void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    private void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    private void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    private void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }




}
