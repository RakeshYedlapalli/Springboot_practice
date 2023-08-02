package com.gap.sample.practice.geeksforgeek;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        //1+2+3+4+5+6+7+8+9+10
        ArrayList<Integer> output = new SubarrayWithGivenSum().getSumArray(100, 3);
        System.out.println(output);

        String str = "I hope this letter finds you in good health and spirits. I am writing to respond to your recent inquiry about whether you should go to college or try to get a job. After giving this matter some thought, I believe that getting a job would be a better option for you than attending college. Allow me to explain my reasoning.Firstly, I don't think you would enjoy going to college because you've always been more of a hands-on learner, and you prefer to learn by doing things yourself. In college, you would be required to spend a lot of time sitting in lectures and studying, which I don't think would be a good fit for your learning style. Additionally, you would be surrounded by people who are interested in pursuing different career paths, which may make you feel out of place.On the other hand, getting a job is a great idea for you because it would allow you to start earning money and gain valuable work experience. You've always been good at problem-solving and have a knack for fixing things, so I believe that a job in the trades would be a great fit for you. You could look into jobs as an electrician, plumber, or carpenter, for example. These jobs are in high demand and pay well, so you could make a good living while doing something you enjoy.Another option would be to look for a job in a field that interests you. For instance, if you enjoy working with computers, you could consider a job in IT. If you are interested in healthcare, you could look into becoming a nurse or a medical assistant. The key is to find a job that aligns with your skills and interests.In conclusion, I believe that getting a job would be a better option for you than going to college. Not only would you be able to start earning money and gain valuable work experience, but you could also find a job that aligns with your skills and interests. Whatever path you choose, I wish you all the best and hope that you find success and happiness.";

        String st2 = "Hello Harika. I am w a r to y l t a f a f a a w t go to c o t t t g a j a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a a   ";

        System.out.println(str.split(" ").length);
    }

    public ArrayList<Integer> getSumArray(int number, int target) {
        int[] n = new int[number];

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            n[i - 1] = i;
        }
        for (int i = 0; i < n.length; i++) {
            int sum = 0;
            for (int j = i; j < n.length; j++) {

                if (j < n.length - 1) {
                    sum += n[j] + n[j + 1];
                }
                if (sum == target) {
                    arr.add(i+1);
                    arr.add(j+2);
                    break;
                }
            }
        }
        return arr;
    }
}
