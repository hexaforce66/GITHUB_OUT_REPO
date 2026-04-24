RecordClient: 

import java.io.Stream;

public class Client {

    private int id;
    private String name;
    private double actualBalance;

    public Client(int id, String name, double actualBalance) {
        this.id = id;
        this.name = name;
        this.actualBalance = actualBalance;
    }

    // Rest of the class
}

Stream manageBalance(Stream<Client> clients) {

    clients.forEach(client -> {
        System.out.println("--- BEGIN TRANSACTION ---");
        System.out.println("Client: " + client.getName());
        System.out.println("Initial Balance: " + client.getActualBalance());

        char transactionType = 'R';
        double transactionAmount = 1500.50;
        client.processTransaction(transactionType, transactionAmount);

        System.out.println("--- END OF PROCESS ---");
    });

    return null;
}

void processTransaction(Client client, char transactionType, double amount) {
    switch (transactionType) {
        case 'D':
            client.setActualBalance(client.getActualBalance() + amount);
            System.out.println("DEPOSIT SUCCESSFUL.");
            break;
        case 'R':
            if (client.getActualBalance() >= amount) {
                client.setActualBalance(client.getActualBalance() - amount);
                System.out.println("WITHDRAWAL SUCCESSFUL.");
            } else {
                System.out.println("INSUFFICIENT BALANCE.");
            }
            break;
    }
    System.out.println("Final Balance: " + client.getActualBalance());
}
