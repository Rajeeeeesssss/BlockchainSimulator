package com.example;

public class Main {
    public static void main(String[] args) {
        int difficulty = 4; // Adjust mining difficulty
        Blockchain blockchain = new Blockchain(difficulty);

        System.out.println("Mining block 1...");
        Block block1 = new Block(1, blockchain.getLatestBlock().getHash());
        block1.addTransaction(new Transaction("Alice", "Bob", 50));
        block1.addTransaction(new Transaction("Charlie", "David", 25));
        blockchain.addBlock(block1);

        System.out.println("Mining block 2...");
        Block block2 = new Block(2, blockchain.getLatestBlock().getHash());
        block2.addTransaction(new Transaction("Eve", "Frank", 100));
        blockchain.addBlock(block2);

        System.out.println("\nBlockchain is valid: " + blockchain.isChainValid());

        System.out.println("\nFull Blockchain:");
        blockchain.displayChain();
    }
}
