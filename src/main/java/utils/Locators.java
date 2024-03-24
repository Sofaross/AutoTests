package utils;

import org.openqa.selenium.By;

public interface Locators {

    interface MainPage{
        By JAVA_quest = By.xpath("/html/body/div[1]/div[1]/nav/div[2]/div[2]/div[2]/div[1]/a/div");

        By JAVA_welcome = By.xpath("//*[@id=\"header\"]/div/div[3]/div[2]/a");
    }

    interface Quests{
        By JAVA_module_one = By.xpath("//*[@id=\"QUEST_JAVA_SYNTAX\"]/a/div[3]");

        By JAVA_module_two = By.xpath("//*[@id=\"QUEST_JAVA_CORE\"]/a/div[3]");

        By JAVA_module_three = By.xpath("//*[@id=\"QUEST_JRU_JAVA_PROFESSIONAL\"]/a/div[3]");

        By JAVA_module_four = By.xpath("//*[@id=\"QUEST_JRU_HIBERNATE\"]/a/div[1]");
    }

    interface JavaSyntaxModuleOne{
        By  JAVA_Syntax = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-quests-main/jr-page/div/div[2]/jr-quest-page/jr-article/article/div[1]/div/div/div[1]/div/div[2]/div/p[2]");
        By  JAVA_Syntax2 = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-quests-main/jr-page/div/div[2]/jr-quest-page/jr-article/article/div[1]/div/div/div[1]/div/div[2]/div/p[1]");
    }

    interface JavaSyntaxModuleTwo{
        By JAVA_Syntax = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-quests-main/jr-page/div/div[2]/jr-quest-page/jr-article/article/div[1]/div/div/div[1]/div/div[2]/div/p/span[1]");
    }

    interface JavaSyntaxModuleThree{
        By JAVA_Syntax = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-quests-main/jr-page/div/div[2]/jr-quest-page/jr-article/article/div[1]/div/div/div[1]/div/div[2]/div/p/span[1]");
    }

    interface JavaSyntaxModuleFour{
        By JAVA_Syntax = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-quests-main/jr-page/div/div[2]/jr-quest-page/jr-article/article/div[1]/div/div/div[1]/div/div[2]/div/p/span[1]");
    }

    interface Welcome{
        By JAVA_login = By.xpath("//*[@id=\"id_button_jr_welcome_start_learning_1\"]");

    }

    interface Login{
        By login = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-auth/jr-page/div/div[2]/jr-login/div/div/div/div/div[1]/jr-login-by-email/form/div[1]/input");
        By password = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-auth/jr-page/div/div[2]/jr-login/div/div/div/div/div[1]/jr-login-by-email/form/div[2]/input");
        By loginButton = By.xpath("/html/body/jr-root/jr-main-site/div[2]/div/div/div[5]/jr-auth/jr-page/div/div[2]/jr-login/div/div/div/div/div[1]/jr-login-by-email/form/button");
    }
}

