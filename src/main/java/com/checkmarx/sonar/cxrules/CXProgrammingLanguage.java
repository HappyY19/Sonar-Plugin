package com.checkmarx.sonar.cxrules;

/**
 * Created by: zoharby.
 * Date: 06/07/2017.
 */
public enum CXProgrammingLanguage {
    CPP("CPP","cpp",4), GO("GO","go",131072), GROOVY("Groovy","grvy",32768), JAVA("Java","java",2), JAVASCRIPT("JavaScript","js",8),
    OBJECTIVE_C("Objc","objc",4096), PERL("Perl","perl",2048), PHP("PHP","php",512), PLSQL("PLSQL","plsql",8192), PYTHON("Python","py",16384),
    RUBY("Ruby","ruby",1024), SCALA("Scala","scala",65536),VB6("VB6","vb6",256);

    private String name;
    private String sonarName;
    private int languageId;

    CXProgrammingLanguage(String name, String sonarName, int languageId) {
        this.name = name;
        this.sonarName = sonarName;
        this.languageId = languageId;
    }

    public String getName() {
        return name;
    }

    public String getSonarName() {
        return sonarName;
    }

    public int getLanguageId() {
        return languageId;
    }

    public static CXProgrammingLanguage fromLanguageId(int languageId){
        for (CXProgrammingLanguage language : CXProgrammingLanguage.values()){
            if(language.getLanguageId() == languageId){
                return language;
            }
        }
        return null;
    }
}