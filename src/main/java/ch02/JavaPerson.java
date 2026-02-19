package ch02;

class JavaPerson {
    private final String name;
    private boolean isStudent;
    private boolean isTeacher;
    private boolean hasCar;

    public JavaPerson(String name, boolean isStudent, boolean isTeacher, boolean hasCar) {
        this.name = name;
        this.isStudent = isStudent;
        this.isTeacher = isTeacher;
        this.hasCar = hasCar;
    }

    public String getName() {
        return name;
    }

    public boolean getIsStudent() { // 그냥 getXXX
        return isStudent;
    }

    public void setIsStudent(boolean student) { // 그냥 setXXX
        isStudent = student;
    }

    public boolean isTeacher() { // kotlin getter 네이밍 방식
        return isTeacher;
    }

    public void setTeacher(boolean teacher) { // kotlin setter 네이밍 방식
        isTeacher = teacher;
    }

    public boolean getHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }
}