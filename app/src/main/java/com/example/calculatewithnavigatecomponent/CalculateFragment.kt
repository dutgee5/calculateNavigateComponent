package com.example.calculatewithnavigatecomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.calculatewithnavigatecomponent.databinding.FragmentCalculateBinding
import net.objecthunter.exp4j.ExpressionBuilder


class CalculateFragment : Fragment() {

    private var _binding:FragmentCalculateBinding? = null
    private val bingind get() = _binding!!

    private var input = ""


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCalculateBinding.inflate(inflater,container,false)


        bingind.topla.setOnClickListener {

        }

        return bingind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttons = listOf(
            bingind.sifir,
            bingind.bir,bingind.iki,bingind.uc,
            bingind.dort,bingind.bes,bingind.alti,
            bingind.yedi,bingind.sekiz,bingind.dokuz,
            bingind.topla,bingind.eksi,
            bingind.carp,bingind.bol,
            bingind.virgul,
            bingind.sonuc,
        )

        buttons.forEach { button ->
            button.setOnClickListener {
               val text =button.text.toString()
                input += text
                bingind.textView.text  = input
            }
        }

        bingind.sonuc.setOnClickListener {
            try {
                val expression = ExpressionBuilder(input).build()
                val result = expression.evaluate()
                bingind.textView.text = result.toString()
                input = result.toString() // sonucu yeni giriş olarak kaydet
            } catch (e: Exception) {
                bingind.textView.text = "Hata"
            }
        }

        bingind.delete.setOnClickListener {
            input = ""
            bingind.textView.text = "0"
        }

        bingind.back.setOnClickListener {
            if (input.isNotEmpty()) {
                input = input.dropLast(1)  // Son karakteri sil
                bingind.textView.text = input
            }
        }


        bingind.yuzde.setOnClickListener {
            if (input.isNotEmpty()) {
                try {
                    val number = input.toDouble()  // Girilen sayıyı al
                    val result = number / 100      // Yüzdeyi al
                    input = result.toString()      // Sonucu input'a ekle
                    bingind.textView.text = input
                } catch (e: Exception) {
                    bingind.textView.text = "Hata"
                    input = ""
                }
            }
        }

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}