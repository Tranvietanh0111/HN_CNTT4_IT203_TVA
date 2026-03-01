package Sesson14.Bai5;

public class Patient {
    private String name;
    private int severity;
    private int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    public String getName() { return name; }
    public int getSeverity() { return severity; }
    public int getArrivalTime() { return arrivalTime; }

    @Override
    public String toString() {
        String level = (severity == 1) ? "Nguy kịch" : (severity == 2 ? "Nặng" : "Nhẹ");
        return "Bệnh nhân " + name + " (Mức " + severity + " - " + level +
                ", Đến lúc: " + arrivalTime + ")";
    }
}