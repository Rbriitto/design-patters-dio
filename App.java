public class App {

    public static void main(String[] args) {

        // Obtendo a instância única de ConfigSingleton
        ConfigSingleton config1 = ConfigSingleton.getInstance();
        System.out.println("Database URL: " + config1.getDatabaseUrl());
        System.out.println("API Key: " + config1.getApiKey());

        // Obtendo a mesma instância novamente, demonstrando que é a mesma
        ConfigSingleton config2 = ConfigSingleton.getInstance();

        // Verificando se ambas as instâncias são a mesma
        if (config1 == config2) {
            System.out.println("As instâncias são iguais, ou seja, é o padrão Singleton.");
        }
    }
}
