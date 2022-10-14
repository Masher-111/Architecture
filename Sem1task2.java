public class Sem1task2
{
    class ModelStore
    {
        public PoligonalModel models;
        public Scene scenes;
        public Flash flashes;
        public Camera cameras;


        public Scene getScene(int s)
        {
            Scene sceneOne = new Scene();
            return sceneOne;
        }

        public void  notifyChange(ModelChanger c)
        {

        }
    }

    class Scene
    {
        public int id;
        public PoligonalModel models;
        public Flash flashes;

        pulic Type method1(Type t)
    {
        return t;
    }

        pulic Type method1(Type t1, Type t2)
    {
        return t1;
    }

    }

    class PoligonalModel
    {
        public Poligon poligons;
        public Texture textures;
    }

    class Texture
    {

    }

    class Poligon
    {
        public Point3D points;
    }

    class Flash
    {
        public Point3D location;
        public Angle3D angle;
        public Color color;
        public Float power;

        public void Rotate(Angle3D a)
        {

        }

        public void Move(Point3D p)
        {

        }
    }

    class Camera
    {
        public Point3D location;
        public Angle3D angle;

        public void Rotate(Angle3D a)
        {

        }

        public void Move(Point3D p)
        {

        }
    }

}
