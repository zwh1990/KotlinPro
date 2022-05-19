package learn2

import java.awt.event.WindowEvent
import java.awt.event.WindowListener
import javax.swing.JButton
import javax.swing.JFrame

fun main() {
    val jFrame = JFrame("my frame");
    val jButton = JButton("my button")
    jFrame.addWindowListener(object : WindowListener {
        override fun windowOpened(e: WindowEvent?) {
            println("windowOpened")
        }

        override fun windowClosing(e: WindowEvent?) {
            println("windowClosing")
        }

        override fun windowClosed(e: WindowEvent?) {
            println("windowClosed")
        }

        override fun windowIconified(e: WindowEvent?) {

        }

        override fun windowDeiconified(e: WindowEvent?) {

        }

        override fun windowActivated(e: WindowEvent?) {

        }

        override fun windowDeactivated(e: WindowEvent?) {

        }
    })

    jButton.addActionListener { println("actionPerformed") }
    jFrame.add(jButton)
    jFrame.pack()
    jFrame.isVisible = true
    jFrame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
}