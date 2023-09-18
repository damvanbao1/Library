package statics;

public enum ReaderType {
        student("sinh vien"),
    post_student("hoc vien caqo hoc"),
    teacher("giang vien");
        public String value;

    ReaderType(String value) {
        this.value = value;
    }
}
