package model.util;

import model.exception.InvalidateDate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    public static void gerarNota(Double basicPayment, Double tax, Double totalValue, String caminho) throws IOException {
        // Define o caminho completo do arquivo
        String fileName = caminho + File.separator + "nota.txt";

        LocalDateTime now = LocalDateTime.now();
        // Formata a data e hora no padrão desejado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = now.format(formatter);

        File file = new File(fileName);

        // Verifica se o diretório existe; se não, cria o diretório
        File diretorio = new File(caminho);
        if (!diretorio.exists()) {
            diretorio.mkdirs(); // Cria o diretório e quaisquer diretórios pais necessários
        }

        // Usando try-with-resources para garantir que o BufferedWriter seja fechado
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file, true))) {
            br.write("===============================================================");
            br.write("Data: " + dataFormatada + "\n");
            br.write("========================= NOTA FISCAL =========================\n");
            br.write("Pagamento básico: " + String.format("R$ %.2f", basicPayment) + "\n");
            br.write("Imposto: " + String.format("R$ %.2f", tax) + "\n");
            br.write("Pagamento total: " + String.format("R$ %.2f", totalValue) + "\n");
            br.write("===============================================================\n");
            br.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao processar arquivo: " + e.getMessage());
            throw e; // Re-lança a exceção para que o chamador possa tratá-la
        }
    }

        public static LocalDateTime dates(Scanner sc, DateTimeFormatter fmt) {
            LocalDateTime date = null;
            while (date == null) {
                    System.out.print("(dd/MM/yyyy HH:mm): ");
                    date = LocalDateTime.parse(sc.nextLine(), fmt);
            }
            return date;
        }

    public static void validarDatas(LocalDateTime start, LocalDateTime finish) throws InvalidateDate {
        if (finish.isBefore(start)) {
            throw new InvalidateDate("A data de retorno não pode ser anterior à data de entrega.");
        }
    }

    public static Double price(Scanner sc, String per) {
        while (true) {
            try {
                System.out.print(per);
                return sc.nextDouble(); // Retorna diretamente o valor válido
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Tente novamente.");
                sc.nextLine(); // Limpar o buffer do scanner
            }
        }
    }

}
