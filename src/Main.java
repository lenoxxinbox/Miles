public class Main {
    public static void main(String[] args) {

        // ���������� ���������� ��� ������� ������ �
        // ���������� ���������: ���� ��� ��������
        // ��������� ������, ������ ��� �������� ����������
        // ������ ��� ����� �������� �����

        int ticketPrice = 1_056;
        int rublesPerMile = 20;

        // ������������� ���������� �������� �����, ���������
        // �������� ��������� ����������. ����� ���������� �
        // ����� ���������� � �������� �� �����

        int bonus = ticketPrice / rublesPerMile;
        System.out.println("���������� �������� ���� �� �����: " + bonus);
    }
}
