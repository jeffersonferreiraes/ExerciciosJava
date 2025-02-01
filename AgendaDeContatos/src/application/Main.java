package application;

import util.MainUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============LISTA DE CONTATOS===============");
        Scanner sc = new Scanner(System.in);


        HashMap<String, Long> contact = new HashMap<>();
        List<Map.Entry<String, Long>> contactList;

        int option;
        do {
            System.out.println();
            System.out.println("1 - ADICIONAR CONTATO" +
                    "\n" +
                    "2 - REMOVER CONTATO" +
                    "\n" +
                    "3 - LISTAR CONTATOS" +
                    "\n" +
                    "4 - SAIR");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            option = sc.nextInt();
            System.out.println();

            String name;
            Long contato;
            switch (option) {
                case 1:
                    System.out.print("Nome: ");
                    name = sc.next();
                    System.out.print("Contato: ");
                    contato = sc.nextLong();
                    contact.put(name, contato);
                    break;
                case 2:
                    System.out.print("Nome do contato que deseja remover: ");
                    name = sc.next();
                    if (contact.containsKey(name)) {
                        contact.remove(name);
                        System.out.println("Contato removido.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;
                case 3:
                    if (contact.isEmpty()) {
                        System.out.println("Nenhum contato na lista.");
                    } else {

                        contactList = new ArrayList<>(contact.entrySet());

                        MainUtil.quickSort(contactList, 0, contactList.size() - 1);

                        System.out.println("========================================================");
                        for (Map.Entry<String, Long> entry : contactList) {
                            System.out.println("Nome: " + entry.getKey() + " | Contato: " + entry.getValue());
                        }
                        System.out.println("========================================================");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 4);

        sc.close();
    }
}
