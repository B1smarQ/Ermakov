package main;

import geometry.Point2D;
import geometry.PolyLine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Starter {
    public static void main(String[] args) throws FileNotFoundException {
        List<Point2D> points = List.of(new Point2D(1,1), new Point2D(5,7),
                new Point2D(1,1), new Point2D(5,-19), new Point2D(7,12));
        Scanner scanner = new Scanner(new File("C:\\Users\\Egor\\IdeaProjects\\Ermakov\\src\\Points.txt"));
        List<PolyLine> line = Stream.generate(scanner::nextLine)
                .peek(System.out::println)
                .takeWhile(x-> scanner.hasNextLine())
                .map(s->s.split(" "))
                .map(strings -> new Point2D(Integer.parseInt(strings[0]), Integer.parseInt(strings[1])))
                .distinct()
                .map(p-> new Point2D(p.getX(), p.getY()<0?-p.getY():p.getY()))
                .sorted()
                .collect(Collectors.groupingBy(Point2D::getY))
                .values()
                .stream()
                .map(PolyLine::new)
                .toList();
        System.out.println(line);
    }
}
