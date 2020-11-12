package ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.core;

import ec.edu.utpl.arqapl.o20f21.semana5.primerparcial.out.Printer;

import java.io.File;

public class EBook {
    private String text;
    private Translate translate;


    //Se envia parametros por el contructor de la clase "Translate"
    translateText(); //Se va a utilizar el polimorfismo que permite Principio de abierto y cerrado.

    verifyAccess(String token);
    //Se utiliza el Principio de responsabilidad unica, al seperar el metodo de acceso
    //a una sola clase "VerAccess"

    public String translate() {
        var enText = "...";
        System.out.printf("Traduciendo el %s a Inglés\n", text);

        //Sentencias para la traducción
        //...

        return enText;
    }
    public boolean verifyAccess(String token) {
        var access = false ;
        System.out.println("Verificando acceso");

        //Sentencias para verificar el token
        //...

        return access;
    }

    public File export(Exportable exportable, String format) {
        return switch (format.toUpperCase()) {
            case "PDF" -> exportable.toPdf(text);
            case "HTML" -> exportable.toHtml(text);
            case "DOCX" -> exportable.toDocx(text);
            case "ODT" -> exportable.toOdt(text);
            default -> exportable.toMd(text);
        };
    }

    public void screenAdapter(Screen screen) {
        ScreenText screenText = new ScreenText();
        //1. Generar formato intermedio
        //Sentencias para transformar a código intermedio.
        //...

        //2. Calcular características texto
        if(!(screen instanceof BrailleDevice)) {
            screenText.calcTextFeatures(screen);
        }
        //3. Enviar a pantalla
        screenText.render(screen);
    }

    public void print(Printer printer) {
        printer.print(text);
    }
}
