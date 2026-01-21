package com.sorting.medwarehouse;

class MedWarehouse {

    // Merge Sort method
    static void mergeSort(Medicine[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted sublists
    static void merge(Medicine[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].expiryDays <= R[j].expiryDays) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Alert for medicines nearing expiry
    static void expiryAlert(Medicine[] arr, int threshold) {
        System.out.println("\n Near Expiry Medicines (≤ " + threshold + " days):");
        for (Medicine m : arr) {
            if (m.expiryDays <= threshold) {
                System.out.println(m.name + " → " + m.expiryDays + " days left");
            }
        }
    }

    // Display medicines
    static void display(Medicine[] arr) {
        for (Medicine m : arr) {
            System.out.println(m.name + " | Expiry in " + m.expiryDays + " days");
        }
    }

    public static void main(String[] args) {

        // Branch-wise sorted lists combined
        Medicine[] medicines = {
            new Medicine("Paracetamol", 5),
            new Medicine("Aspirin", 12),
            new Medicine("Insulin", 2),
            new Medicine("Cough Syrup", 20),
            new Medicine("Antibiotic", 8)
        };

        System.out.println(" Before Sorting:");
        display(medicines);

        mergeSort(medicines, 0, medicines.length - 1);

        System.out.println("\n After Sorting by Expiry Date:");
        display(medicines);

        expiryAlert(medicines, 7);
    }
}
