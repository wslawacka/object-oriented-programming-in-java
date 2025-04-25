package si.um.opj.Slawacka.ui;

import javax.swing.*;
import java.awt.*;

public class AppGUI {

    private JPanel mainPanel;
    private JPanel cards;

    private final static String VENUEPANEL = "Venue";
    private final static String ATHLETEPANEL = "Athlete";
    private final static String EVENTPANEL = "Event";

    public AppGUI(){
        mainPanel = new JPanel(new BorderLayout());
        addComponentToPane(mainPanel);
    }

    public void addComponentToPane(Container pane){
        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.addTab(VENUEPANEL, createVenuePanel());
        tabbedPane.addTab(ATHLETEPANEL, createAthletePanel());
        tabbedPane.addTab(EVENTPANEL, createEventPanel());

        pane.add(tabbedPane, BorderLayout.CENTER);
    }

    private JPanel createAthletePanel(){
        JPanel panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Athlete Management", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        panel.add(new JLabel("Athlete details will appear here...", SwingConstants.CENTER), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.add(new JButton("Create Athlete"));
        buttonPanel.add(new JButton("Edit Athlete"));
        buttonPanel.add(new JButton("Delete Athlete"));
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createVenuePanel(){
        JPanel panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Venue Management", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        panel.add(new JLabel("Venue details will appear here...", SwingConstants.CENTER), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.add(new JButton("Create Venue"));
        buttonPanel.add(new JButton("Edit Venue"));
        buttonPanel.add(new JButton("Delete Venue"));
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createEventPanel(){
        JPanel panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Event Management", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(title, BorderLayout.NORTH);

        panel.add(new JLabel("Event details will appear here...", SwingConstants.CENTER), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.add(new JButton("Create Event"));
        buttonPanel.add(new JButton("Edit Event"));
        buttonPanel.add(new JButton("Delete Event"));
        panel.add(buttonPanel, BorderLayout.SOUTH);

        return panel;
    }

    private static void createAndShowGUI(){
        JFrame frame = new JFrame("Sports Management System");
        AppGUI app = new AppGUI();

        frame.setContentPane(app.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(AppGUI::createAndShowGUI);
    }
}
