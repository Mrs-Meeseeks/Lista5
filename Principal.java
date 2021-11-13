package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Path caminho = Paths.get("funcionarios.csv");
        Path caminhoSaida = Paths.get("func_filtrados.csv");


        //leitura
        try {
            List<String> Conteudo = Files.readAllLines(caminho);

            //Parsing/Mapeamento/geraçao de novo arquivo e preenchimento
            Conteudo.forEach(l -> {
                String linhaSplit[] = l.split(",");

                //filtro de kids
                if (!linhaSplit[3].equals("0")) {

                    Employees funcionario = new Employees(linhaSplit[0], linhaSplit[3], linhaSplit[4]);
                    try {
                        Files.writeString(caminhoSaida,
                                funcionario.toString(),
                                StandardOpenOption.CREATE,
                                StandardOpenOption.APPEND);
                    } catch (Exception e) {
                    }

                }

            });


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
