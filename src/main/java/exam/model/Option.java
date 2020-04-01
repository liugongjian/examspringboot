package exam.model;

import org.springframework.data.mongodb.core.mapping.Document;

public class Option {
    private String option_name;
    private String option_desc;

    public Option(){}

    public Option(String option_name, String option_desc) {
        this.option_name = option_name;
        this.option_desc = option_desc;
    }

    public String getOption_name() {
        return option_name;
    }

    public void setOption_name(String option_name) {
        this.option_name = option_name;
    }

    public String getOption_desc() {
        return option_desc;
    }

    public void setOption_desc(String option_desc) {
        this.option_desc = option_desc;
    }
}
