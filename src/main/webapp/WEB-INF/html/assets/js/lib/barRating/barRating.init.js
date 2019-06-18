$(function() {
    "use strict";
    function ratingEnable() {
        $('#wang-1to10').barrating('show', {
            theme: 'bars-1to10'
        });

        $('#wang-movie').barrating('show', {
            theme: 'bars-movie'
        });

//        $('#wang-movie').barrating('set', 'Mediocre');

        $('#wang-square').barrating('show', {
            theme: 'bars-square',
            showValues: true,
            showSelectedRating: false
        });

        $('#wang-pill').barrating('show', {
            theme: 'bars-pill',
            initialRating: 'A',
            showValues: true,
            showSelectedRating: false,
            allowEmpty: true,
            emptyValue: '-- no rating selected --',
            onSelect: function(value, text) {
                alert('Selected rating: ' + value);
            }
        });

        $('#wang-reversed').barrating('show', {
            theme: 'bars-reversed',
            showSelectedRating: true,
            reverse: true
        });

        $('#wang-horizontal').barrating('show', {
            theme: 'bars-horizontal',
            reverse: true,
            hoverState: false
        });

        $('#wang-fontawesome').barrating({
            theme: 'fontawesome-stars',
            showSelectedRating: false
        });

        $('#wang-css').barrating({
            theme: 'css-stars',
            showSelectedRating: false
        });

        $('#wang-bootstrap').barrating({
            theme: 'bootstrap-stars',
            showSelectedRating: false
        });

        var currentRating = $('#wang-fontawesome-o').data('current-rating');

        $('.stars-wang-fontawesome-o .current-rating')
            .find('span')
            .html(currentRating);

        $('.stars-wang-fontawesome-o .clear-rating').on('click', function(event) {
            event.preventDefault();

            $('#wang-fontawesome-o')
                .barrating('clear');
        });

        $('#wang-fontawesome-o').barrating({
            theme: 'fontawesome-stars-o',
            showSelectedRating: false,
            initialRating: currentRating,
            onSelect: function(value, text) {
                if (!value) {
                    $('#wang-fontawesome-o')
                        .barrating('clear');
                } else {
                    $('.stars-wang-fontawesome-o .current-rating')
                        .addClass('hidden');

                    $('.stars-wang-fontawesome-o .your-rating')
                        .removeClass('hidden')
                        .find('span')
                        .html(value);
                }
            },
            onClear: function(value, text) {
                $('.stars-wang-fontawesome-o')
                    .find('.current-rating')
                    .removeClass('hidden')
                    .end()
                    .find('.your-rating')
                    .addClass('hidden');
            }
        });
    }

    function ratingDisable() {
        $('select').barrating('destroy');
    }

    $('.rating-enable').on("click", function(event) {
        event.preventDefault();

        ratingEnable();

        $(this).addClass('deactivated');
        $('.rating-disable').removeClass('deactivated');
    });

    $('.rating-disable').on("click", function(event) {
        event.preventDefault();

        ratingDisable();

        $(this).addClass('deactivated');
        $('.rating-enable').removeClass('deactivated');
    });

    ratingEnable();
});
