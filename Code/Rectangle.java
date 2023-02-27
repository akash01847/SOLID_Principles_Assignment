// This code defines two classes: Rectangle and Square using SOLID principles.

class Rectangle {
    int m_width;
    int m_height;

    public void setWidth(int width) {
        m_width = width;
    }

    public void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}

class Square extends Rectangle {

    public void set_square_side(int side) {
        m_width = side;
        m_height = side;
    }
}
