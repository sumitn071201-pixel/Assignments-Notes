using System;
using System.Collections.Generic;
using Microsoft.EntityFrameworkCore;

namespace DBFirstDemo.Models;

public partial class IetdbContext : DbContext
{
    public IetdbContext()
    {
    }

    public IetdbContext(DbContextOptions<IetdbContext> options)
        : base(options)
    {
    }

    public virtual DbSet<Emp> Emps { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder){ }
    //#warning To protect potentially sensitive information in your connection string, you should move it out of source code. You can avoid scaffolding the connection string by using the Name= syntax to read it from configuration - see https://go.microsoft.com/fwlink/?linkid=2131148. For more guidance on storing connection strings, see https://go.microsoft.com/fwlink/?LinkId=723263.
    //    => optionsBuilder.UseSqlServer("Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=IETDB;Integrated Security=True");

    protected override void OnModelCreating(ModelBuilder modelBuilder)
    {

        modelBuilder.Entity<Emp>(entity =>
        {
            entity.ToTable("Emp");

            entity.Property(e => e.Id).HasColumnName("id");
            entity.Property(e => e.Address)
                .HasMaxLength(50)
                .IsUnicode(false)
                .HasColumnName("address");
            entity.Property(e => e.Name)
                .HasMaxLength(50)
                .IsUnicode(false)
                .HasColumnName("name");
        });

        OnModelCreatingPartial(modelBuilder);
    }

       
    

    partial void OnModelCreatingPartial(ModelBuilder modelBuilder);
}
