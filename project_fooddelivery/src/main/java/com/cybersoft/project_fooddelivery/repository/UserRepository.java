package com.cybersoft.project_fooddelivery.repository;

import com.cybersoft.project_fooddelivery.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


//public interface UserRepository extends JpaRepository<Category,Integer> {
//public interface UserRepository extends JpaRepository<Food,Integer> {
//public interface UserRepository extends JpaRepository<FoodAddon,Integer> {
//public interface UserRepository extends JpaRepository<FoodDetail,Integer> {
//public interface UserRepository extends JpaRepository<FoodMaterial,Integer> {
//public interface UserRepository extends JpaRepository<FoodOrder,Integer> {
//public interface UserRepository extends JpaRepository<FoodReview,Integer> {
//public interface UserRepository extends JpaRepository<Material,Integer> {
//public interface UserRepository extends JpaRepository<OrderStatus,Integer> {
//public interface UserRepository extends JpaRepository<Restaurant,Integer> {
//public interface UserRepository extends JpaRepository<RestaurantReview,Integer> {
//public interface UserRepository extends JpaRepository<Status,Integer> {
//public interface UserRepository extends JpaRepository<Torder,Integer> {
//public interface UserRepository extends JpaRepository<User,Integer> {
public interface UserRepository extends JpaRepository<UserDetail,Integer> {


}
