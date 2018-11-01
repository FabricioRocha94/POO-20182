package controller.comando;

import dao.LivroDAO;
import dao.proxy.LivroDAOProxy;

import java.util.Scanner;

public class RemoverLivro implements Command {

    @Override
    public void execute(Scanner entrada) {
        LivroDAO dao = LivroDAOProxy.getInstance();
        System.out.println("Entre com o código do livro a ser removido:");
        dao.remove(entrada.nextInt());
    }
}
