package com.alpha.practicalwork27.work3;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhone {

    private MyPhoneBook phonebook = new MyPhoneBook();
    private Camera camera;
    private MemoryCard memoryCard;

    public void switchOn() {
        System.out.println("\nLoading PhoneBook records...");
        phonebook.addPhoneNumber("Ivan", "522-232");
        phonebook.addPhoneNumber("Svetlana", "334-23-23");
        phonebook.addPhoneNumber("Ivan", "555-55-55");
        phonebook.addPhoneNumber("Unknown", "0");
        phonebook.addPhoneNumber("Svetlana", "123-45-67");
        phonebook.addPhoneNumber("Sergey", "999-99-09");
        System.out.print("Loading is complete\n");
    }

    public void call(int pos) {
        if(phonebook.records[pos] != null)
            System.out.printf("\nCalling to %s\n", phonebook.records[pos].record);
        else
            System.out.println("\nCall : Record with position " + pos + " not found!");
    }

    public void addCamera(String model) {
        camera = new Camera(model) {
            @Override
            public void makePhoto() {
                System.out.println("Photo click");
            }
        };
    }

    public void addMemoryCard(int size) {
        memoryCard = new MemoryCard(10);
    }

    public void printInfo() {
        System.out.println("\n === Phone info ===");
        System.out.println(phonebook);
        if(camera != null) System.out.println(camera);
        if(memoryCard != null) System.out.println();
    }

    public MyPhoneBook getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(MyPhoneBook phonebook) {
        this.phonebook = phonebook;
    }

    @Override
    public String toString() {
        return "MyPhone : " +
                "phonebook=" + phonebook;
    }

    class MemoryCard {

        private int size;

        public MemoryCard(int size) {
            this.size = size;
            getPhonebook().records = Arrays.copyOf(getPhonebook().records, getPhonebook().records.length + size);
            System.out.println("\nNew Memory Card inserted. New size of PhoneBook = " + getPhonebook().records.length);
        }

        @Override
        public String toString() {
            return "MemoryCard : " +
                    "size=" + size;
        }
    }

    class MyPhoneBook {

        private PhoneRecord[] records = new PhoneRecord[10];
        private int count ;

        public void addPhoneNumber(String name, String phone) {
            if(count < records.length) {
                records[count] = new PhoneRecord(name, phone);
                System.out.print(records[count++]);
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("PhoneBook : \n");
            Arrays.stream(records).forEach(r -> {if (r != null) sb.append(r.toString());});
            sb.append("Size of phonebook = ").append(records.length);
            return sb.toString();
        }

        class PhoneRecord {
            private String record;
            private String phone;

            public PhoneRecord(String record, String phone) {
                this.record = record;
                this.phone = phone;
            }

            public String getRecord() {
                return record;
            }

            public void setRecord(String record) {
                this.record = record;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Name='" + record + '\'' + ", Phone='" + phone + "\n";
            }
        }
    }
}
