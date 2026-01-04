package com.linkedlist.roundrobin;

public class RoundRobinScheduler {
	private ProcessNode head = null;
    private ProcessNode tail = null;
    private int processCount = 0;

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        processCount++;
    }

    // Remove process by ID
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = tail;

        do {
            if (curr.processId == pid) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head)
                        head = curr.next;
                    if (curr == tail)
                        tail = prev;
                }
                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("No processes in queue.");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.print("[PID " + temp.processId +
                    " | Remaining: " + temp.remainingTime + "] -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    // Round Robin Scheduling Simulation
    public void schedule(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int completed = 0;

        ProcessNode curr = head;

        while (processCount > 0) {

            System.out.println("\nExecuting Process ID: " + curr.processId);

            if (curr.remainingTime > timeQuantum) {
                time += timeQuantum;
                curr.remainingTime -= timeQuantum;
            } else {
                time += curr.remainingTime;
                curr.remainingTime = 0;

                completed++;
                totalTurnaroundTime += time;
                totalWaitingTime += time - curr.burstTime;

                int finishedPid = curr.processId;
                curr = curr.next;
                removeProcess(finishedPid);
                displayProcesses();
                continue;
            }

            curr = curr.next;
            displayProcesses();
        }

        System.out.println("\nAverage Waiting Time: " +
                (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnaroundTime / completed);
    }
}